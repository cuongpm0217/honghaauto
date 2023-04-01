package com.hha.services;

import com.hha.entities.Product;

import java.util.List;

public interface ProductService {
	List<Product> getAllProduct();

	Product createProduct(Product product);

	Product updateProduct(long productId, Product product);

	void deleteProduct(long productId);

	void hidden(long id);

	Product getProductById(long productId);
}
