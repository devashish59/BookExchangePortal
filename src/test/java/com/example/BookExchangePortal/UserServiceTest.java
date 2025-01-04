package com.example.BookExchangePortal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;

import com.example.BookExchangePortal.user.User;
import com.example.BookExchangePortal.user.UserController;
import com.example.BookExchangePortal.user.UserRepository;
import com.example.BookExchangePortal.user.UserService;

import jakarta.inject.Inject;

@ExtendWith(MockitoExtension.class)

public class UserServiceTest {
    
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    @InjectMocks
    private UserService userService;
    
    @BeforeEach
    public void testBefore() {
        ReflectionTestUtils.setField(userController, "userService", userService);
        ReflectionTestUtils.setField(userService, "userRepository", userRepository);
    }

    @Test
    void getAllUsers() {

        User u1 = new User();
        u1.setEmail("a@a.com");
        User u2 = new User();
        u2.setEmail("b@b.com");

        when(userRepository.findAll()).thenReturn(Arrays.asList(new User[] {u1, u2}));
        ResponseEntity<List<User>> response = userController.getUsers();
        List<User> users = response.getBody();
        assertNotNull(users);
        assertEquals(2, users.size());
    }
}
