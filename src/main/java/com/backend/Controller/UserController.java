package com.backend.Controller;


	import javax.servlet.http.HttpSession;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;

	import com.backend.Entity.User;
	import com.backend.Service.UserService;


	

	
	@Controller

	public class UserController {
	    
		@Autowired
	    UserService userService;

	 
	   
		@GetMapping("/")
	    public String signIn(Model model) {


	        model.addAttribute("user", new User());

	        return "signIn";
	    }
		
		 @PostMapping("/signIn")  
	
	    @GetMapping("/signUp")
	    public String signUp(Model model) {

	       
	        
	        model.addAttribute("user", new User());

	       
	        return "signUp";
	    }
	    
	   

	    @PostMapping("/signUp")
	   
	    public String signUp(@ModelAttribute("user") User user, Model model) {

//	        User loggedInUser = userService.createAccount(user);

	      
//	        if(loggedInUser == null) {
//	            model.addAttribute("message", "Your email password combo isn't valid, ya FOO!");
//
//	            return "signUp";
//	        }

	       
	        model.addAttribute("user", new User());

	        return "signUp";
	    }

	   
	    
	                  
	   
	    
	    
	    public String signIn(@ModelAttribute("user") User user, HttpSession session , Model model) {

	        User loggedInUser = userService.findByEmailAndPassword(user);

	        if(loggedInUser == null) {
	            return "signIn";
	        }

	        session.setAttribute("loggedInUser", loggedInUser);
	        return "main";

	    }
	    
	    
	    

	}
	    

