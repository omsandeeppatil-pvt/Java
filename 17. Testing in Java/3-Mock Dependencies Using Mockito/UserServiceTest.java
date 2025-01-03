import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void testGetUserEmailById() {
        // Mock UserRepository
        UserRepository userRepository = mock(UserRepository.class);
        UserService userService = new UserService(userRepository);

        // Stub a method
        when(userRepository.findById(1)).thenReturn(new User(1, "John Doe", "john.doe@example.com"));

        // Verify functionality
        assertEquals("john.doe@example.com", userService.getUserEmailById(1));
        verify(userRepository, times(1)).findById(1);
    }
}
