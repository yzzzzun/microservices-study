package com.yzzzzun.microservices.product.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Product {
	private final long productId;
	private final String name;
	private final int weight;
}
