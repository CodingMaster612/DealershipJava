package com.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Admin;



	@Repository
	public interface AdminRepo extends JpaRepository<Admin, Integer>{
		
		
		@Query(value="select * from admin where id=?1 and Adminkey=?2 and is_admin=?3" , nativeQuery = true)
		public Admin findByIdAndAdminkey(Integer id, String Adminkey, Boolean isAdmin);





		 

		

		

		
	}

