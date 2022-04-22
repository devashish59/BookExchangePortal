package com.example.BookExchangePortal;

import java.util.List;

import com.example.BookExchangePortal.user.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookExchangePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookExchangePortalApplication.class, args);
	}

	@GetMapping
	public List<User> hello(){
		return List.of(new User("Shivam", "1","xxxx", "shivamagrawal@gmail.com", "9876543210", "address", true));
	}

}
