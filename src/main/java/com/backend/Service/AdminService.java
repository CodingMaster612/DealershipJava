package com.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Admin;
import com.backend.repo.AdminRepo;

@Service
public class AdminService {
	@Autowired
	AdminRepo adminRepo;
	
	
	 public Admin createAccount(Admin admin) {

	        return save(admin);
	    }
	    
	    public Admin save(Admin admin) {
	        return adminRepo.save(admin);
	    }
	    
	    public Admin findByIdAndAdminkey(Admin admin) {
	        return adminRepo.findByIdAndAdminkey(admin.getId(), admin.getAdminkey());
	    }

	    public Admin findAdminById(Integer adminId) {
	        return adminRepo.findById(adminId).get();
	    }
	    

	    
	  
}
