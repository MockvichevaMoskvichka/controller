package com.example.core_1.mappers;

import com.example.core_1.controller.UserDTO;
import org.apache.catalina.User;
import org.mapstruct.Mapper;
import java.beans.Customizer;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO toDTO (User user);
}
