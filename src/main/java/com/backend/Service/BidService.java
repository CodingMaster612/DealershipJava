package com.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.Admin;
import com.backend.Entity.Bid;

import com.backend.repo.BidRepo;


@Service
public class BidService {
	@Autowired
	BidRepo bidRepo;
	
	
	public Bid createBid(Bid bid) {
		
		
		
		
		 if(doesBidExists(bid.getBid())) {
			 return null;
		 }
		 

		 bidRepo.save(bid);

	        return bid;
	}
	
	 private boolean doesBidExists(Integer bid) {
		// TODO Auto-generated method stub
		return false;
	}

	

	public Bid findByBidOnCar(Bid bid) {
		return bidRepo.findByBidOnCar( bid.getBid());
	}

	


	
}
