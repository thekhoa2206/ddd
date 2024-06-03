package com.example.ddd.example1.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderPayment {
    private String id;
    private String paymentMethod;
    private BigDecimal amount;
    private String createdBy;
    private String orderId;
}
