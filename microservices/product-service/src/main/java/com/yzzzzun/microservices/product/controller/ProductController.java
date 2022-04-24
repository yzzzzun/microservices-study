package com.yzzzzun.microservices.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yzzzzun.microservices.product.domain.entity.Product;
import com.yzzzzun.microservices.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	@GetMapping("/product/{productId}")
	ResponseEntity<Product> getProduct(@PathVariable long productId){
		return ResponseEntity.ok(productService.getProduct(productId));
	}
}
