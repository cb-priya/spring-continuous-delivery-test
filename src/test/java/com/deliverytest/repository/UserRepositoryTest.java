
package com.deliverytest.repository;

import java.util.Optional;
import com.deliverytest.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void givenUser_save_returnsUser() {
        User user = new User(1L, "john", "test");
        userRepository.save(user);

        Optional<User> user2 = userRepository.findById(1L);
        assert ("john" == user2.get().getFirstName());
    }
}

