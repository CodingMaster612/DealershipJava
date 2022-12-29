package com.backend.Entity;


	import java.util.Date;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="product")
	public class Product {
		
		@Id
		
		
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		
		@Column(name="id")
		private Integer id;
		@Column(name="mabufacturer")
		private String manufacturer;
		@Column(name="mileage")
		private Integer mileage;
		@Column(name="price")
		private Integer price;
		@Column(name="model")
		
		private String model;
		@Column(name="description")
		private String description;
		@Column(name="images")
		private String images;
		@Column(name="time")
		private Integer time;
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public Integer getMileage() {
			return mileage;
		}
		public void setMileage(Integer mileage) {
			this.mileage = mileage;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImages() {
			return images;
		}
		public void setImages(String images) {
			this.images = images;
		}
		public Integer getTime() {
			return time;
		}
		public void setTime(Integer time) {
			this.time = time;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", manufacturer=" + manufacturer + ", mileage=" + mileage + ", price=" + price
					+ ", model=" + model + ", description=" + description + ", images=" + images + ", time=" + time
					+ "]";
		}
	
	
	
	
	
	
	
	
	}
