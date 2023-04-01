package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.Product;
import com.hha.repository.ProductRepository;
import com.hha.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository proRepo;
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(long productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(long productId) {
		proRepo.deleteById(productId);
	}

	@Override
	public boolean hidden(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByGroupId(long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByTypeId(long typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
