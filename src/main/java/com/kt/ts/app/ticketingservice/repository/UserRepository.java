package com.kt.ts.app.ticketingservice.repository;

import com.kt.ts.app.ticketingservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{

}