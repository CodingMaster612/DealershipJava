package com.backend.Controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	        
	        
	        
	        
	       

	        model.addAttribute("allCars", allProducts);
	        
	        
	        
	        User user = userService.buyProduct(1,1);
	        
	        model.addAttribute("allUser", user);
	       

	        return "items";
	    }

}
