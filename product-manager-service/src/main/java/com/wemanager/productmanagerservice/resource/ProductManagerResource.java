package com.wemanager.productmanagerservice.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wemanager.productmanagerservice.models.Product;

@RestController
@RequestMapping("/productManager")
public class ProductManagerResource {
	
	@RequestMapping("/{productId}")
	public Product getProductInfo(@PathVariable("productId") String productId) {
		
		if(productId.equals("productId1")) {	
			return new Product(productId,"productName1",12.45,0.54,"Category1");
		}
		if(productId.equals("productId2")) {	
			return new Product(productId,"productName2",12453.45,5.7774,"Category1");
		}
		if(productId.equals("productId3")) {	
			return new Product(productId,"productName3",12.45,74.578,"Category3");
		}
		if(productId.equals("productId4")) {	
			return new Product(productId,"productName4",12.45,434,"Category1");
		}
		
		return new Product("Error","No Product Found",0,0,"Error");
	}

	@RequestMapping("/productOrder/{orderId}")
	public List<Product> getProductList(@PathVariable("orderId") String orderId){
		
		List<Product> productList = Arrays.asList( 
				new Product("productId1","productName1",12.45,0.54,"Category1"),
				new Product("productId2","productName1",12.45,0.54,"Category1"),
				new Product("productId3","productName1",12.45,0.54,"Category2")
				);
		
		return productList;
	}
	
}
