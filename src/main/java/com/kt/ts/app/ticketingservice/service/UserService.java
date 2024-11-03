package com.kt.ts.app.ticketingservice.service;

import com.kt.ts.app.ticketingservice.model.User;
import com.kt.ts.app.ticketingservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    public User saveUser(User user) {
        return userRepo.save(user);
    }
    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
