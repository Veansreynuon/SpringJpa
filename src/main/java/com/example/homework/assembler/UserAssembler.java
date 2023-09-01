package com.example.homework.assembler;

import com.example.homework.controller.UserController;
import com.example.homework.dto.UserDto;
import com.example.homework.entity.User;
import com.example.homework.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
@Component
@Configuration
public class UserAssembler extends RepresentationModelAssemblerSupport<User, EntityModel<UserDto>> {

    public UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public UserAssembler() {
        super(UserController.class, (Class<EntityModel<UserDto>>) (Class<?>) EntityModel.class);
    }

    @Override
    public EntityModel<UserDto> toModel(User entity) {
        UserDto userDto = userMapper.userDtoToUser(entity);
        Link link = linkTo(methodOn(UserController.class).getUserByUuid(entity.getUuid())).withSelfRel();
        Link collection = linkTo(methodOn(UserController.class).getAllUsers()).withRel(IanaLinkRelations.COLLECTION);
        return EntityModel.of(userDto,link,collection);
    }

    @Override
    public CollectionModel<EntityModel<UserDto>> toCollectionModel(Iterable<? extends User> entities) {
        return super.toCollectionModel(entities);
    }
}
