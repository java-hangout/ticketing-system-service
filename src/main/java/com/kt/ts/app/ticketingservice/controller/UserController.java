package com.kt.ts.app.ticketingservice.controller;

import java.util.List;

import com.kt.ts.app.ticketingservice.model.User;
import com.kt.ts.app.ticketingservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /*https://www.geeksforgeeks.org/how-to-connect-mongodb-with-spring-boot/*/
    @Autowired
    private UserService userService;
    
    // Save method is predefine method in Mongo Repository
    // with this method we will save user in our database
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
    // findAll method is predefine method in Mongo Repository 
    // with this method we will all user that is save in our database
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
