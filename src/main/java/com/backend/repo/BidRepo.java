package com.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Bid;
import com.backend.Entity.Product;

@Repository
public interface BidRepo extends JpaRepository<Bid, Integer>{
	
	
	@Query(value="select * from  bid where bid=?1", nativeQuery = true)
	public Bid findByBidOnCar(Integer bid);
}
