package com.digitalhouse.microservices.orders.service;

import com.digitalhouse.microservices.orders.dto.OrderDto;

import java.util.List;

public interface OrderService {

    List<OrderDto> getAll();

}
