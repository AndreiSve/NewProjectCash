package com.example.newprojectcash.service;

import com.example.newprojectcash.accessingdatamysql.User;
import com.example.newprojectcash.accessingdatamysql.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        userRepository.save(user);
    }
}