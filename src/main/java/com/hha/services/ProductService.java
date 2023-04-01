package com.hha.services;

import com.hha.entities.Product;

import java.util.List;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(long productId, Product product);

	void deleteProduct(long productId);

	boolean hidden(long id);

	Product getProductById(long productId);

	List<Product> getAllProduct();

	List<Product> getByGroupId(long groupId);

	List<Product> getByTypeId(long typeId);
}
