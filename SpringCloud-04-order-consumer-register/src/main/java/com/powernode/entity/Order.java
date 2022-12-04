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
public class Order implements Serializable {
    private Integer id;
    private String orderName;
    private BigDecimal orderMoney;
    private Integer productId;
    private Integer orderStatus;
    private Integer memberId;

}
