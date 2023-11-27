package com.example.core_1.controller;

import com.example.core_1.model.Role;
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
    private Set<RoleDTOs> roles;

}
