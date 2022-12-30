package com.backend.Controller;


	import javax.servlet.http.HttpSession;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.backend.Entity.User;
	import com.backend.Service.UserService;


	

	
	@Controller

	public class UserController {
	    
		 @Autowired
		    UserService userService;
		    
		    @GetMapping("/")
		    public String index(HttpSession session, Model model) {
		        
		        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

		        if(loggedInUserId != null) {
		            System.out.println(loggedInUserId);
		            User loggedInUser = userService.findUserById(loggedInUserId);
		            model.addAttribute("loggedInUser", loggedInUser);

		        }
		        return "Home";
		    }

		    @GetMapping("/signUp")
		    public String signUp(Model model) {

		        model.addAttribute("user", new User());
		        return "signUp";
		    }

		    @PostMapping("/signUp")
		    public String signUp(@ModelAttribute User user, Model model) {

		        userService.createAccount(user);

		        model.addAttribute("user", new User());

		        return "signIn";

		    }
		    
		    @GetMapping("/signIn")
		    public String signIn(Model model) {

		        model.addAttribute("user", new User());
		        return "signIn";
		    }

		    @PostMapping("/signIn")
		    public String signIn(@ModelAttribute User user, Model model, HttpSession session) {

		        User loggedInUser = userService.findByEmailAndPassword(user);

		        if(loggedInUser != null) {
		            session.setAttribute("loggedInUserId", loggedInUser.getId());

		            model.addAttribute("loggedInUser", loggedInUser);

		            return "Home";
		        } else {
		            model.addAttribute("message", "You don't have an account.");
		            return "signIn";
		        }

		    }
		    
		    @GetMapping("/signOut")
		    public String signOut(Model Model) {
		    	return "Home";
		    }

		    @PostMapping("/signOut")
		    public ModelAndView signOut(HttpSession session) {

		        session.removeAttribute("loggedInUserId");
		        session.removeAttribute("loggedInAdminId");

		        return new ModelAndView("signIn");
		    }
		    
		    
		    
		    


	}
	    

