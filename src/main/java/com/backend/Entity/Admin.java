package com.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
@Id
	
@GeneratedValue(strategy= GenerationType.IDENTITY)

@Column(name="id")
private Integer id;


@Column(name="adminkey")
private String adminkey;








public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getAdminkey() {
	return adminkey;
}


public void setAdminkey(String adminkey) {
	this.adminkey = adminkey;
}




@Override
public String toString() {
	return "Admin [id=" + id + ", adminkey=" + adminkey + "]";
}















}
