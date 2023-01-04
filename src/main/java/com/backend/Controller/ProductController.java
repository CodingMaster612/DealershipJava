package com.backend.Controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.backend.Entity.Admin;
import com.backend.Entity.Product;
import com.backend.Entity.User;
import com.backend.Service.ProductService;
import com.backend.Service.UserService;



@Controller
public class ProductController {
	
	@Autowired
    ProductService productService;
	
	
	@Autowired
    UserService userService;
	
	 
	
	
	
	 
	
	 @GetMapping("/productLogging")
	    public String ProductLogging(Model model) {

	       
	        model.addAttribute("Product", new Product());

	        return "productLogging";
	    }
	 @PostMapping("/productLogging")
	 public String ProductLogging(@ModelAttribute("Product") Product product, Model model) {

	      
	        Product loggedProduct= productService.createProduct(product);

	        if(loggedProduct == null) {
	            model.addAttribute("message", "Your ProductLogging isn't valid");

	            return "productLogging";
	        }

	        
	        model.addAttribute("Product", new Product());

	        return "productLogging";
	    }
	 
	 
	 
	 @GetMapping("/items")
	    public String viewAllProduct(Model model, HttpSession session) {

	        Integer loggedInCarId = (Integer) session.getAttribute("loggedInCarId");
	        
	        if(loggedInCarId != null) {
	            Product loggedInProduct = productService.findProductById(loggedInCarId);
	            model.addAttribute("loggedInCar", loggedInProduct);
	            
	        }

	        List<Product> allProducts = productService.getAllProducts();
	        
	        
	        model.addAttribute("product", new Product());
	        
	       

	        model.addAttribute("allCars", allProducts);
	        
	        //add model atrtribute for logged in user 
	      
	       
	       

	       
	       

	        return "items";
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	
	 
	 
	 
	 
	 
	 
	 
	 @PostMapping("/buyProduct/{productId}")
	    public String buyProduct(Model model , Product product ,@PathVariable("productId") Integer productId, HttpSession session) {

		 Integer userId = (Integer) session.getAttribute("loggedInUserId");
		 
		 
		 User loggedInUser = userService.buyProduct(userId, productId);

	        if(loggedInUser != null) {
	            session.setAttribute("loggedInUserId", loggedInUser.getId());

	            model.addAttribute("loggedInUser", loggedInUser);

	        }

	 
	 
	 
	 //need to get user off session loggedin user id session attribute 
	 
     			return "items";
	 }
		 
	        

	        
	        
	        
	        
	        
	        
}       

	        
	        
	        
	       
	       
	    
	 
	 


