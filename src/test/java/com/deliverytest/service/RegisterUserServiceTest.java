package com.deliverytest.service;

import com.deliverytest.models.User;
import com.deliverytest.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RegisterUserServiceTest {

    private UserRepository userRepository = new UserRepository();

    private RegisterUserService registerUserService;

    @BeforeEach
    void initUseCase() {
        registerUserService = new RegisterUserService(userRepository);
    }

    @Test
    void savedUserHasRegistrationDate() {
        User user = new User(1L, "Priya", "Sebastian");
        User savedUser = registerUserService.registerUser(user);
        assertThat(savedUser.getRegistrationDate()).isNotNull();
    }

}
