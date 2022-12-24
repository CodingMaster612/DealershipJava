package com.backend.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	    
    
	    
	    @GetMapping("/admin/{adminId}/report")
	    public String is_Admin(@PathVariable("adminId") Integer adminId, HttpSession session, Model model) {
	    
	    	Admin admin = adminService.findAdminById(adminId);
	        Integer loggedInAdminId = (Integer) session.getAttribute("loggedInAdminId");
	        Admin loggedInAdmin;
	        if(loggedInAdminId != null) {
	            loggedInAdmin = adminService.findAdminById(loggedInAdminId);
	                
	            model.addAttribute("loggedInAdmin", loggedInAdmin);
	            
//	           validate fucntion here
	    
	            	
	    
	    
	    }
	        return "report";
	    
	    
	    
	    
	     
	      
	    
}
	    
//	    	@PreAuthorize("isAdmin(1)")
//	      @GetMapping("{adminId}")
//	      public String giveAccess(@PathVariable("adminId") Integer adminId, Model model,  HttpSession session) {
//	    	Admin admin = adminService.findAdminById(adminId);
//	        Integer loggedInAdminId = (Integer) session.getAttribute("loggedInAdminId");
//	        Admin loggedInAdmin;
//	        if(loggedInAdminId != null) {
//	            loggedInAdmin = adminService.findAdminById(loggedInAdminId);
//	                
//	            model.addAttribute("loggedInAdmin", loggedInAdmin);
//	      }
}
	    
}