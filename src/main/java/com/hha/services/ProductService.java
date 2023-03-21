package com.hha.services;


import java.util.List;
import com.hha.entities.Product;

public interface ProductService {
	List<Product> getAllProduct();
	Product createProduct(Product product);
	Product updateProduct(long productId,Product product);
	boolean deleteProduct(long productId);
	Product getProductById(long productId);
}
