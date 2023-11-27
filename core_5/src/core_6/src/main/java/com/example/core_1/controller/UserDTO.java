package com.example.core_1.controller;

import com.example.core_1.mappers.UserMapper;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private  Long id;
    private String email;
    private Set<UserMapper> roles;

}
