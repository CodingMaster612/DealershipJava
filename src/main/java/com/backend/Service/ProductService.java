package com.backend.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Product;
import com.backend.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;
	
	
	public Product createProduct(Product product) {
		if(doesDescriptionExist(product.getDescription())) {
			return null;
		}
		
		
		if(doesManufactureExist(product.getManufacturer())) {
	            return null;
	        }
		 if(doesMileageExists(product.getMileage())) {
			 return null;
		 }
		 
		 if(doesModelExists(product.getModel())) {
			 return null;
		 }
		 
		 if(doesPriceExists(product.getPrice())) {
			 return null;
		 }
		 

		 productRepo.save(product);

	        return product;
	}
	
	 public Product findProductById(Integer productId) {
	        return productRepo.findById(productId).get();
	    }


	private boolean doesPriceExists(Integer price) {
		// TODO Auto-generated method stub
		return false;
	}


	private boolean doesModelExists(String model) {
		// TODO Auto-generated method stub
		return false;
	}


	private boolean doesMileageExists(Integer mileage) {
		// TODO Auto-generated method stub
		return false;
	}


	private boolean doesManufactureExist(String manufacturer) {
		// TODO Auto-generated method stub
		return false;
	}


	private boolean doesDescriptionExist(String description) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Product save(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getProductOnLot() {
        return productRepo.getProductsOnLot();
    }
	public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    public Product getCarById(Integer id) {
        return productRepo.findById(id).get();
    }
    public List<Product> getAllBoughtProducts() {
        return productRepo.getAllBoughtProducts();
    }
}
