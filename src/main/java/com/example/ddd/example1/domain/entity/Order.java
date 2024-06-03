package com.example.ddd.example1.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class Order {
    private String id;
    private BigDecimal total;
    private String description;
    private String code;
    private String customerId;
    private String paymentStatus;
    private String status;
}
