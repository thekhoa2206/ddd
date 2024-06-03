package com.example.ddd.example1.domain.factory;

import com.example.ddd.example1.domain.entity.Order;

public class OrderFactory {
    public static Order createOrderEvent(){
        return new Order();
    }
}
