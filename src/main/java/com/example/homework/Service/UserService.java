package com.example.homework.Service;

import com.example.homework.dto.CreateUserDto;
import com.example.homework.dto.UpdateUserDto;
import com.example.homework.entity.User;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

public interface UserService {
    CollectionModel<?> findAllUsers();
    EntityModel<?> findUserByUuid(String uuid);
    User updateUserByUuid(String uuid, UpdateUserDto userDto);
}
