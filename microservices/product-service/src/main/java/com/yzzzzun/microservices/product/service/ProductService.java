package com.yzzzzun.microservices.product.service;

import org.springframework.stereotype.Service;

import com.yzzzzun.microservices.product.domain.entity.Product;

@Service
public class ProductService {

	public Product getProduct(long productId){
		return new Product(productId, "name-" + productId, 123);
	}
}
