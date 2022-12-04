package com.powernode.dao;

import com.powernode.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductDao {
    /**
     * 根据商品的id获取商品的信息
     * @param id
     * @return
     */
    Product getById1(@Param("id") Integer id);
}
