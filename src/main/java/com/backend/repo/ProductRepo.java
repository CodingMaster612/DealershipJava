package com.backend.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Product;



@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	
	
	@Query(value="select * from  and description=?1 and maufacture=?2 and mileage=?3 and model=?4 and price=?5 and time=?6", nativeQuery = true)
	public Product findByInformationOnCar(String description, String manufacture , Integer mileage, String model, Integer price ,Integer time);
	
	@Query(value = "select * from product where user_id is null", nativeQuery = true)
    public List<Product> getProductsOnLot();
	
	@Query(value = "select * from product where user_id is not null", nativeQuery = true)
    public List<Product> getAllBoughtProducts();
	
	@Query(value = "select * from product where user_id is not null", nativeQuery = true)
    public List<Product> deleteCars();
}
