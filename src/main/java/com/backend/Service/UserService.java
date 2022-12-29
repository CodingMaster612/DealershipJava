package com.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Product;
import com.backend.Entity.User;
import com.backend.repo.UserRepo;


@Service
public class UserService {
	@Autowired
    UserRepo userRepo;
    
	 @Autowired
	    ProductService productService;

    public User createAccount(User user) {

        return save(user);
    }
    
    public User save(User user) {
        return userRepo.save(user);
    }
    
    public User findByEmailAndPassword(User user) {
        return userRepo.findByUserNameAndPassword(user.getUsername(), user.getPassword());
    }

    public User findUserById(Integer userId) {
        return userRepo.findById(userId).get();
    }
    
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
    
    
    public User buyProduct(Integer userId, Integer productId) {

        User loggedInUser = findUserById(userId);

       Product product = productService.findProductById(productId);

        loggedInUser.getStorage().add(product);

        return save(loggedInUser);
    }
	
}
