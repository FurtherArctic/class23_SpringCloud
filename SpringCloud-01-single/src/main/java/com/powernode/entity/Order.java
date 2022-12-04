package com.powernode.entity;

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
public class Order implements Serializable {
    private Integer id;
    private String orderName;
    private BigDecimal orderMoney;
    private Integer productId;
    private String orderStatus;
    private String memberId;
}
