package com.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bid")
public class Bid {
	@Id
	
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	
	@Column(name="bid")
	private Integer bid;
	
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Bid [bid=" + bid + "]";
	}
	
	
	
	
}
