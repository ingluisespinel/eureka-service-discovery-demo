package com.digitalhouse.microservices.users.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private String name;
    private Integer age;
}
