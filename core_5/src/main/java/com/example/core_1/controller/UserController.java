package com.example.core_1.controller;

import com.example.core_1.model.Role;
import com.example.core_1.services.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    private UserService userService;


    @GetMapping("/hello{id}")
    public User sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);
        return toDTO(user);
    }
        private UserDTO toDTO (User user) {
       Set<RoleDTO> roleDTOS = toDTOs(user.getRoles());
        return UserDTO.builder().id(user.getId()).email(user.getEmail()).roles(user.getRoles()).build();

        private Set<RoleDTO> roleDTOS(Set < Role > role) {
            return role.stream().map(role1 -> toDTO(role1)).collect(Collectors.toSet());

        }
    }
}