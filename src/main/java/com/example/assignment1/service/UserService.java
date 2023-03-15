package com.example.assignment1.service;

import com.example.assignment1.model.User;
import com.example.assignment1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> users  = new ArrayList<>();

        userRepository.findAll()
                .forEach(users::add);

        return users;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(long id) {
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if(optional.isPresent()){
            user = optional.get();
        }else{
            throw new RuntimeException("User is not found for id::" + id);
        }
        return user;
    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
