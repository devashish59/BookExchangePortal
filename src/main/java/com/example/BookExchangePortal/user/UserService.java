package com.example.BookExchangePortal.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
	private UserRepository userRepository;
	
	@Autowired
    public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getUsers(){
		
		return userRepository.findAll();
	}

    public void addNewUser(User user) {
		Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
		if(userOptional.isPresent()) {
			throw new IllegalStateException("Email already used.");
		}
		User newUser = new User(user.getUsername(),user.getPassword(),
								user.getEmail(),user.getPhone(),
								user.getAddress(),user.getIsAdmin());
		userRepository.save(newUser);
    }

	public void deleteUser(String email) {
		Optional<User> userOptional = userRepository.findUserByEmail(email);
		if(!userOptional.isPresent()) {
			throw new IllegalStateException("User with Id "+email+" does not exist.");
		}
		userRepository.deleteByEmail(email);
	}

}
