package com.digitalhouse.microservices.orders.service;

import com.digitalhouse.microservices.orders.dto.OrderDto;
import com.digitalhouse.microservices.orders.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderRepo userRepo;

    @Override
    public List<OrderDto> getAll() {
        return userRepo.getOrders();
    }
}
