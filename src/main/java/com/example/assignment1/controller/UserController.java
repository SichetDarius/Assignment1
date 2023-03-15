package com.example.assignment1.controller;

import com.example.assignment1.model.User;
import com.example.assignment1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/cashiers")
    public List<User> showCashiers() {
        return userService.getAllUsers().stream().filter(user -> user.getRole().equals("CASHIER")).collect(Collectors.toList());
    }

    @PostMapping
    public void addCashier(@RequestBody User user) {
        user.setRole("CASHIER");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userService.saveUser(user);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody User user) {
        user.setRole("CASHIER");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userService.saveUser(user);
    }





    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(value = "id") long id) {
        userService.deleteUserById(id);
    }

}
