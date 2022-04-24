package com.example.BookExchangePortal.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public List<User> getUsers(){
		return List.of(new User("Shivam", "1","xxxx", "shivamagrawal@gmail.com", "9876543210", "address", true));
	}
}
