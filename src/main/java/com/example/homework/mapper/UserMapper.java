package com.example.homework.mapper;

import com.example.homework.dto.UserDto;
import com.example.homework.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class) ;

    UserDto userDtoToUser(User user );

    List<UserDto> listUserDtoToUser(List<User> user);

}
