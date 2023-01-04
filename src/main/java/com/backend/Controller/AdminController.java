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
import com.backend.Service.AdminService;
import com.backend.Service.ProductService;
import com.backend.Service.UserService;

@Controller
public class AdminController {
	 @Autowired
	 AdminService adminService;
	 @Autowired
	 UserService userService;
	 
	 @Autowired
	 ProductService productService;
	 
	 @GetMapping("/admin")
	    public String admin(Model model) {

	        model.addAttribute("admin", new Admin());
	        return "admin";
	    }

	    @PostMapping("/admin")
	    public String admin(@ModelAttribute Admin admin, Model model, HttpSession session) {

	        Admin loggedInAdmin = adminService.findByIdAndAdminkey(admin);

	        if(loggedInAdmin != null) {
	            session.setAttribute("loggedInAdminId", loggedInAdmin.getId());

	            model.addAttribute("loggedInAdmin", loggedInAdmin);

	            return "adminHome";
	        } else {
	            model.addAttribute("message", "You don't have an account.");
	            return "admin";
	        }

	    }
	    
    
	    
	    @GetMapping("/report")
	    public String reports(Model model, HttpSession session) {

	        Integer adminId = (Integer) session.getAttribute("loggedInUserId");

	        if(adminId != null) {
	            User admin = userService.findUserById(adminId);



	            model.addAttribute("admin", admin);

	            List<User> productPurchasers = userService.getUserPurchasers();

	            model.addAttribute("userList", productPurchasers);

	            List<Product> product = productService.getAllBoughtProducts();

	            model.addAttribute("purchasedProduct", product);
	        }

	        return "report";
	    }
	    

	    @GetMapping("/report/{userId}")
	    public String reports(Model model, HttpSession session, @PathVariable Integer userId) {

	        Integer adminId = (Integer) session.getAttribute("loggedInUserId");

	        if(adminId != null) {
	            User admin = userService.findUserById(adminId);



	            model.addAttribute("admin", admin);

	            List<User> productPurchasers = userService.getUserPurchasers();

	            model.addAttribute("userList", productPurchasers);

	            User focusUser = userService.findUserById(userId);

	            model.addAttribute("focusUser", focusUser);

	            model.addAttribute("purchasedProducts", focusUser.getStorage());
	        }

	        return "report";
	    }
	   
	               
	    
	          	
	            
	            	
	    
	    
	    
	       
	    
	    
	    
	    
	     
	      
	    
}
	    


	    
