package com.example.BookExchangePortal.request;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RequestConfig {
    

    @Bean
    CommandLineRunner commandLineRunnerRequest(RequestRepository repository){
        return args->{

        };
    }
}
