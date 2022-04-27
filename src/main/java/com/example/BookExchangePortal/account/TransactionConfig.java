package com.example.BookExchangePortal.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransactionConfig {
    
    @Bean
    CommandLineRunner CommandLineRunnertx(TransactionRepository tx){
        return args->{

        };
    }
}
