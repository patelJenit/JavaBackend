package com.wemanager.ordermanagerservice.models;

public class Product {
	
	private String productId;
	private String productName;
	private double price;
	private double weight;
	private String categoryID;
		
	public Product(String productId, String productName, double price, double weight, String categoryID) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.weight = weight;
		this.categoryID = categoryID;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	

}
