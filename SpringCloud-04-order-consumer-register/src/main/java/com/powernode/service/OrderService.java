package com.powernode.service;

public interface OrderService {
    /**
     * 下订单
     * @param memberId 会员id
     * @param productId 商品id
     * @return
     */
    Integer doOrder(Integer memberId, Integer productId);
}
