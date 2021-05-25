package com.deliverytest.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import com.deliverytest.models.User;
import com.deliverytest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(final User user) {
        user.setRegistrationDate(System.currentTimeMillis());
        return userRepository.save(user);
    }

    public Optional<User> findById(final Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
