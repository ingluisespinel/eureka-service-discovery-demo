package com.digitalhouse.microservices.orders.controller;

import com.digitalhouse.microservices.orders.dto.OrderDto;
import com.digitalhouse.microservices.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderDto> getAllOrders(){
        return orderService.getAll();
    }

}
