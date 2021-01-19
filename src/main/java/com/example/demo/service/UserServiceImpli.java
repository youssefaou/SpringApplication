package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpli implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByUsername(String username) {
        User user = null;
        try {
            user = userRepository.findUserByUsername(username);
        } catch (Exception exception) {
            throw exception;
        }
        return user;
    }
}
