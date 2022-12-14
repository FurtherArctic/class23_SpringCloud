package com.powernode.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable {
    private Integer id;
    private String productName;
    private BigDecimal price;
    private Integer stock;

}
