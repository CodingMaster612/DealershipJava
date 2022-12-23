package com.backend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.backend.Entity.Admin;
import com.backend.Entity.User;
import com.backend.Service.AdminService;

@Controller
public class AdminController {
	 @Autowired
	 AdminService adminService;
	 
	 
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

	            return "Home";
	        } else {
	            model.addAttribute("message", "You don't have an account.");
	            return "admin";
	        }

	    }
}
