package com.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Admin;



	@Repository
	public interface AdminRepo extends JpaRepository<Admin, Integer>{
		
		
		@Query(value="select * from user where id=?1 and Adminkey=?2" , nativeQuery = true)
		public Admin findByIdAndAdminkey(Integer id, String Adminkey);
	}

