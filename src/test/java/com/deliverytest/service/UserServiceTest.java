package com.deliverytest.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import com.deliverytest.models.User;
import com.deliverytest.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class UserServiceTest {

    @InjectMocks
    @Autowired
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        User john = new User(1L, "john", "ten");
        User bob = new User(1L, "bob", "twenty");
        User alex = new User(1L, "alex", "thirty");

        List<User> allUsers = Arrays.asList(john, bob, alex);

        Mockito.when(userRepository.findById(any())).thenReturn(Optional.of(john));
        Mockito.when(userRepository.findAll()).thenReturn(allUsers);
        Mockito.when(userRepository.findById(99L)).thenReturn(Optional.empty());
    }

    @Test
    void verifyFindById() {
        Optional<User> user = userService.findById(1L);
        assert ("john" == user.get().getFirstName());
    }

    @Test
    void verifyFindAll() {
        List<User> users = userService.findAll();
        assert (3 == users.size());
    }

}
