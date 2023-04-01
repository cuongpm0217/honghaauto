package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.ProductGroup;
import com.hha.repository.ProductGroupRepository;
import com.hha.services.ProductGroupService;

@Service
public class ProductGroupServiceImpl implements ProductGroupService{
	@Autowired
	private ProductGroupRepository proGRepo;
	@Override
	public ProductGroup create(ProductGroup pg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductGroup update(long id, ProductGroup pg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		//check product in group
		proGRepo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductGroup getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductGroup> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
