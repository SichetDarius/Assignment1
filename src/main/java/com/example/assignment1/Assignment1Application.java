package com.example.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,}
)
public class Assignment1Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignment1Application.class, args);
    }

}
