package com.digitalhouse.microservices.orders.repository;

import com.digitalhouse.microservices.orders.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class OrderRepo {
    private List<OrderDto> orders;

    @Autowired
    public OrderRepo(){
        orders =new ArrayList<>();
        orders.add(OrderDto.builder()
                .id(UUID.randomUUID().toString())
                .total(1000l)
                .build());
        orders.add(OrderDto.builder()
                .id(UUID.randomUUID().toString())
                .total(2000l)
                .build());
    }

    public List<OrderDto> getOrders(){
        return orders;
    }

}
