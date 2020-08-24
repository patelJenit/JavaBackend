package com.wemanager.ordermanagerservice.models;

import java.util.List;

public class OrderProducts {
	
	private List<Product>  orderProduct;
	
	public OrderProducts() {}

	public OrderProducts(List<Product> orderProduct) {
		super();
		this.orderProduct = orderProduct;
	}

	public List<Product> getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(List<Product> orderProduct) {
		this.orderProduct = orderProduct;
	}
	
	

}
