package com.wemanager.Customermanagerservice.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.DiscoveryClient;
import com.wemanager.Customermanagerservice.model.OrderInfo;
import com.wemanager.Customermanagerservice.model.Product;
import com.wemanager.Customermanagerservice.model.User;

@RestController
@RequestMapping("/user")
public class UserResource {

	@Autowired
	private RestTemplate restTemplate;
		
	@RequestMapping("/{userId}")
	public User getUserProfile(@PathVariable("userId") String userId) {		
		return null;
	}
	
	
	@RequestMapping("/userOrderList/{userId}")
	public List<OrderInfo> getOrderInfoForUser(@PathVariable("userId") String userId){		
		
		List<String> orderIds = Arrays.asList("o101","o102");		
		List<String> productIds = Arrays.asList("productId1","productId2","productId3","productId4");
		List<OrderInfo> lo = new ArrayList<>();
		
		if(userId.equalsIgnoreCase("User101")) {
			productIds.forEach(productId -> {
				lo.add(new OrderInfo(orderIds.get(0),
						userId,
						"Placed",
						54.658, 
						"TestDesc101", 
						Arrays.asList(restTemplate.getForObject("http://PRODUCT-MANAGER-SERVICE/productManager/" + productId, Product.class))
						)
						);
			});
		}
		
		if(userId.equalsIgnoreCase("User102")) {
			orderIds.forEach(orderId -> {
			lo.add(restTemplate.getForObject("http://ORDER-MANAGER-SERVICE/orderManager/" + orderId, OrderInfo.class));
			});
		}
			
			
		return lo;		
	}
	
}
