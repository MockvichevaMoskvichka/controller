package com.example.core_1.dto.User;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DTO {
    private Long id;
    private String email;
    private  String password;
}
