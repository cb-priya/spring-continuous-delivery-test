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

    private UserRepository userRepository = new UserRepository();

    public List<User> findAll() {
        return userRepository.getUsers();
    }

}
