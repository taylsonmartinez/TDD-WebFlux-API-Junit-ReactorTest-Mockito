package com.expertsclub.tddwebflux;


import com.expertsclub.tddwebflux.domain.Order;

public class OrderBuilder {

    public static Order order() {
        return Order.builder()
                .id("ec-1")
                .name("tdd com webflux")
                .price(6000L)
                .build();
    }

}
