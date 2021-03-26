package com.deliverytest.repository;

import com.deliverytest.models.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {

    private static HashMap<Long, User> users = new HashMap<>();

    public User save(User user) {
        user.setRegistrationDate(System.currentTimeMillis());
        users.put(user.getId(), user);
        return user;
    }
}
