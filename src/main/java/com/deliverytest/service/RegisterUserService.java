package com.deliverytest.service;

import com.deliverytest.models.User;
import com.deliverytest.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    private final UserRepository userRepository;

    public RegisterUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

}