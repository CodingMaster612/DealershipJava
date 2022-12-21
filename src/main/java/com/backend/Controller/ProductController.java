package com.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



public class ProductController {
	
	 
	
	
	
	 
	
	 @GetMapping("/ProductLogging")
	    public String CarLog(Model model) {

	       
	        model.addAttribute("Product", new Product());

	        return "ProductLogging";
	    }
	 @PostMapping("/ProductLogging")
	 public String CarLog(@ModelAttribute("car") Product product, Model model) {

	      
	        Product loggedCar= productService.createCar(product);

	        if(loggedCar == null) {
	            model.addAttribute("message", "Your ProductLogging isn't valid");

	            return "ProductLogging";
	        }

	        
	        model.addAttribute("car", new Product());

	        return "ProductLogging";
	    }
}
