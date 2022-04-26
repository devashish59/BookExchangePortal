package com.example.BookExchangePortal.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
    
    @Bean
    CommandLineRunner commandLineRunnerBook(BookRepository repository){
        return args->{

        };
    }
}
