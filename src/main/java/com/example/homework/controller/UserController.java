package com.example.homework.controller;

import com.example.homework.Service.UserService;
import com.example.homework.dto.UpdateUserDto;
import com.example.homework.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public CollectionModel<?> getAllUsers() {
        CollectionModel model = userService.findAllUsers();
        return model;
    }


    @GetMapping("/{uuid}")
    public EntityModel<?> getUserByUuid(@PathVariable String uuid) {

        return userService.findUserByUuid(uuid);
    }
    @PutMapping("/{uuid}")
    public ResponseEntity<?> updateUserByUuid(@RequestBody UpdateUserDto createUserDto, @PathVariable("uuid") String uuid) {

        User user = userService.updateUserByUuid(uuid,createUserDto);

        return ResponseEntity.ok().body(user);

    }



}
