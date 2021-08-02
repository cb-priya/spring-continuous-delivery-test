package com.deliverytest.repository;

import java.util.ArrayList;
import java.util.List;
import com.deliverytest.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        this.users.add(new User(1L, "John","Doe"));
        this.users.add(new User(2L, "Jane", "Doe"));
    }

    public List<User> getUsers() {
        return this.users;
    }

}
