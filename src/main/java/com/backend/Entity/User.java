package com.backend.Entity;



import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="user")
public class User {
	
	@Id
	
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="id")
	
    
    private Integer id;
	
   
	@Column(name = "username", unique = true, nullable = false)
    private String username;

     // Column maps to the same name as the column name in the database, it is case sensitive
     @Column(name = "password", nullable = false)
     
    private String password;
    
    @Column(name = "isAdmin", nullable = false, columnDefinition = "boolean default 0")
    private Boolean isAdmin;
    
    
    @OneToMany
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private List<Product> storage;
    
   public User() {
    }

   
   
   
    public List<Product> getStorage() {
	return storage;
}




public void setStorage(List<Product> storage) {
	this.storage = storage;
}




	public Boolean getIsAdmin() {
	return isAdmin;
}




public void setIsAdmin(Boolean isAdmin) {
	this.isAdmin = isAdmin;
}




	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	


}




