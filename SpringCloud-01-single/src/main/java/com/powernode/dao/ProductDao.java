package com.powernode.dao;

import com.powernode.entity.Product;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangjunchen
 */
public interface ProductDao {
    /**
     * 根据商品id获取商品信息
     * @param id 商品id
     * @return Product
     */
    Product getById(@Param("id") Integer id);
}
