package com.wemanager.Customermanagerservice.model;

import java.util.List;

public class OrderInfo {
	
	private String orderId;
	private String customerId;
	private String orderStatus;
	private double price;
	private String desc;
	private List<Product> listOfProducts;
	
	public OrderInfo() {}
	
	public OrderInfo(String orderId, String customerId, String orderStatus, double price, String desc,
			List<Product> listOfProducts) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderStatus = orderStatus;
		this.price = price;
		this.desc = desc;
		this.listOfProducts = listOfProducts;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Product> getListOfProducts() {
		return listOfProducts;
	}
	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	
	
	
}
