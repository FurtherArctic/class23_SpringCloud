package com.powernode.service;

import com.powernode.entity.Product;

public interface ProductService {
    /**
     * 根据商品的id获取该商品
     * @param id 商品id
     * @return
     */
    Product getById(Integer id);
}
