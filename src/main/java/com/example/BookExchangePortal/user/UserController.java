package com.example.BookExchangePortal.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "user")
public class UserController {

    private final UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/getAllUsers")
	public List<User> getUsers(){
		return userService.getUsers();
	}

    @PostMapping(path = "/addUser")
    public void registerNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "/delete/{email}")
    public void deleteUserByEmail(@PathVariable("email") String email) {
        userService.deleteUser(email);
    }
}
