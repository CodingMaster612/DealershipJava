package com.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.backend.Entity.Product;
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
}
