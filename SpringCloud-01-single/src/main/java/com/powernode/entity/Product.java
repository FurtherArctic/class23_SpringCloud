package com.powernode.entity;

import com.sun.source.doctree.SeeTree;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wangjunchen
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    private Integer id;
    private String productName;
    private BigDecimal price;
    private Integer stock;
}
