package com.example.ddd.example1.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderLineItem {
    private String id;
    private String title;
    private String description;
    private BigDecimal price;
    private String orderId;
}
