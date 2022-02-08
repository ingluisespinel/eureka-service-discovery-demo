package com.digitalhouse.microservices.orders.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OrderDto {
    private String id;
    private Long total;
}
