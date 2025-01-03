import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveUser() {
        User user = new User();
        user.setName("Alice");
        user.setEmail("alice@example.com");

        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());
        assertEquals("Alice", savedUser.getName());
    }
}
