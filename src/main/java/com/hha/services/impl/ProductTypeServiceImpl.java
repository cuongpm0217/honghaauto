package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.ProductType;
import com.hha.repository.ProductTypeRepository;
import com.hha.services.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{
	@Autowired
	private ProductTypeRepository proTRepo;
	@Override
	public ProductType create(ProductType pt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductType update(long id, ProductType pt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		//check product of type
		proTRepo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductType getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductType> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
