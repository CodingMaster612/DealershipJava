package com.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.Entity.User;
import com.backend.repo.UserRepo;



public class UserService {
	@Autowired
    UserRepo userRepo;
    
   
	
    
    public User save(User user) {
        return userRepo.save(user);
    }
    
    public User findByEmailAndPassword(User user) {
        return userRepo.findByUserNameAndPassword(user.getUsername(), user.getPassword());
    }
}
