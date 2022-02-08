package com.digitalhouse.microservices.users.service;

import com.digitalhouse.microservices.users.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();

}
