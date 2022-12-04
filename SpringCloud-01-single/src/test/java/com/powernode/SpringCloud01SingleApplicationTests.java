package com.powernode;

import com.powernode.dao.ProductDao;
import com.powernode.entity.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringCloud01SingleApplicationTests {

    @Resource
    private ProductDao productDao;
    @Test
    void contextLoads() {
        Product product = productDao.getById(1);
        assertNotNull(product);
    }

}
