package com.powernode.service.impl;

import com.powernode.dao.ProductDao;
import com.powernode.entity.Product;
import com.powernode.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;
    @Override
    public Product getById(Integer id) {
        return productDao.getById1(id);
    }
}
