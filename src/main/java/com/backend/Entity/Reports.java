package com.backend.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Reports")
public class Reports {
	// ID lets you know its an id, PRIMARY KEY
    @Id
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
    private Integer id;

    /*Many to Many mapping, we will have many different users carts having many products in their cart */
    @ManyToMany
    // The Join table will create a table responsible for holding the foreign key for both tables
    @JoinTable(
        // name of table
		name="report_items",
        // the foreign key we are storing from this file
	    joinColumns = {
            @JoinColumn(name = "bid_id", referencedColumnName="id")
        }, 
        // the foreign key we are storing from the other class
	    inverseJoinColumns = {
            @JoinColumn(name = "product_id", referencedColumnName="id")
        }
	)
    // Its a list since its many products being stored in our cart
    List<Product> products;
    
    
    public Reports() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

	@Override
	public String toString() {
		return "Reports [id=" + id + ", products=" + products + "]";
	}
    
    

}

