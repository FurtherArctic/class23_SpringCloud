package com.powernode.dao;

import com.powernode.entity.Order;

public interface OrderDao {
    /**
     * 下订单，向订单表插入数据
     * @param order
     * @return
     */
    Integer add(Order order);
}
