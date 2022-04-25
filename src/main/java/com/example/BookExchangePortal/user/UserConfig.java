package com.example.BookExchangePortal.user;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UserConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args->{
           User shivam =  new User(
                "Shivam",
                 "xxxx",
                  "shivamagrawal@gmail.com",
                   "9876543210", 
                   "address", 
                   true); 
            User shubham =  new User(
                    "Shubham",
                     "xxxx",
                      "shubhamagrawal@gmail.com",
                       "9876543210", 
                       "address", 
                       true); 
            repository.saveAll(List.of(shivam,shubham));
        };
       
    }
}
