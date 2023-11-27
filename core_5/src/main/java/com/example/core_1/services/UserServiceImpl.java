package com.example.core_1.services;

import com.example.core_1.repositor.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User getUser (Long id){

        return userRepository.getBy_id(id);
    }

}
