package com.example.homework.Service.Impl;

import com.example.homework.Service.UserService;
import com.example.homework.assembler.UserAssembler;
import com.example.homework.dto.UpdateUserDto;
import com.example.homework.entity.User;
import com.example.homework.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService  {
    private final UserAssembler userAssembler;
    private final UserRepository userRepository;
    @Override
    public CollectionModel<?> findAllUsers() {
        List<User> users = userRepository.findByIsDeletedIsFalse();
        return userAssembler.toCollectionModel(users);
    }

    @Override
    public EntityModel<?> findUserByUuid(String uuid) {
        User user = userRepository.findByUuid(uuid).orElseThrow();
        return userAssembler.toModel(user);
    }

    @Override
    public User updateUserByUuid(String uuid, UpdateUserDto updateUserDto) {
        User user = userRepository.findByUuid(uuid).orElseThrow(()-> new EntityNotFoundException("user not found"));
        BeanUtils.copyProperties(updateUserDto,user,uuid);
        return userRepository.save(user);
    }

}
