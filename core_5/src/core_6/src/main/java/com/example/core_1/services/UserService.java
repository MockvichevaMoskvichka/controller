package com.example.core_1.services;

import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public interface UserService {
   User getUser(Long id);
}
