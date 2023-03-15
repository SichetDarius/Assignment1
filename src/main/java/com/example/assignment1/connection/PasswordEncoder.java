package com.example.assignment1.connection;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static void main(String[] args)
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "darius2022";
        String encodePassword = encoder.encode(rawPassword);

        System.out.println(encodePassword);
    }
}