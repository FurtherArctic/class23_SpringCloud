package com.powernode.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyProduct {
//    {
//        "id": 1,
//            "productName": "小米手机",
//            "price": 1200,
//            "stock": 10
//    }
    private Integer id;
    private String productName;
    private BigDecimal price;
    private Integer stock;
}
