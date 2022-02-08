package com.digitalhouse.microservices.users.service;

import com.digitalhouse.microservices.users.dto.UserDto;
import com.digitalhouse.microservices.users.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserDto> getAll() {
        return userRepo.getUsers();
    }
}
