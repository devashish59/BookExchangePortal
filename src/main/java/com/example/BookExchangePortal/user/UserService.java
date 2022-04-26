package com.example.BookExchangePortal.user;

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
		if(userOptional.isPresent()){
			throw new IllegalStateException("Email already used.");
		}
		User newUser = new User(user.getUsername(),user.getPassword(),
								user.getEmail(),user.getPhone(),
								user.getAddress(),user.getIsAdmin());
		userRepository.save(newUser);
    }

	public void deleteUser(Integer userId){
		boolean exists = userRepository.existsById(userId);
		if(!exists)
		{
			throw new IllegalStateException("User with Id "+userId+" does not exists.");
		}
		userRepository.deleteById(userId);
	}

}
