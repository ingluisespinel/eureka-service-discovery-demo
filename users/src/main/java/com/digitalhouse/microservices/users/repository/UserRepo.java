package com.digitalhouse.microservices.users.repository;

import com.digitalhouse.microservices.users.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    private List<UserDto> users;

    @Autowired
    public UserRepo(){
        users=new ArrayList<>();
        users.add(UserDto.builder()
                .name("Luis Espinel")
                .age(27)
                .build());
        users.add(UserDto.builder()
                .name("Camilo")
                .age(30)
                .build());
    }

    public List<UserDto> getUsers(){
        return users;
    }

}
