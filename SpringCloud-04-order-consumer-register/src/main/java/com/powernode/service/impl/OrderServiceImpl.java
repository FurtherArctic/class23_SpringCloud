package com.powernode.service.impl;

import com.powernode.dao.OrderDao;
import com.powernode.entity.Order;
import com.powernode.service.OrderService;
import com.powernode.vo.MyProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private RestTemplate restTemplate;

    /**
     * 调用服务提供者，获取商品信息，然后再下单
     *
     * @param memberId  会员id
     * @param productId 商品id
     * @return
     */
    @Override
    public Integer doOrder(Integer memberId, Integer productId) {
        //1 根据商品id获取该商品的信息，包括价格和库存
        //restTemplate 发请求，接收响应，响应json字符串，把json字符串转换成对象（反序列化）
        //参数1 是请求的地址，参数2是反序列化的类名
        //通过getForObject 说明发出的请求是GET请求
        //String providerUrl="http://localhost:8080/product/";
        //使用注册中心的服务提供者的名字调用接口，不用写死路径
        String providerUrl = "http://PRODUCT-PROVIDER/product/";
        MyProduct myProduct = restTemplate.getForObject(providerUrl + productId, MyProduct.class);
        //2 如果商品存在，并且商品的库存大于0，下订单
        if (null != myProduct && myProduct.getStock() > 0) {
            Order order = Order.builder()
                    .orderName("我下的订单")
                    .orderStatus(0)
                    .orderMoney(myProduct.getPrice())
                    .productId(productId)
                    .memberId(memberId)
                    .build();
            Integer result = orderDao.add(order);
            return result;
        }

        return -2;
    }
}
