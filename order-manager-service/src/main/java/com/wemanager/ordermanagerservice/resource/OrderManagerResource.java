package com.wemanager.ordermanagerservice.resource;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wemanager.ordermanagerservice.models.OrderInfo;
import com.wemanager.ordermanagerservice.models.OrderProducts;
import com.wemanager.ordermanagerservice.models.Product;

@RestController
@RequestMapping("/orderManager")
public class OrderManagerResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{orderId}")
	public OrderInfo getOrderInfo(@PathVariable("orderId") String orderId){
				
		OrderInfo orderInfo = new OrderInfo(orderId,"user101","pending",345.50,"desc101",getProductsForOrder(orderId));		
		return orderInfo;
	}
	
	
	public List<Product> getProductsForOrder(String orderId){
	
		return  Arrays.asList(new Product("productId1","productName1",12.45,0.54,"Category1"),
				new Product("productId2","productName1",12.45,0.54,"Category1"),
				new Product("productId3","productName1",12.45,0.54,"Category2")
				);
	}

}
