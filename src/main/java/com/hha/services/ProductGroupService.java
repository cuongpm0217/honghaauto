package com.hha.services;

import java.util.List;

import com.hha.entities.ProductGroup;

public interface ProductGroupService {
	ProductGroup create(ProductGroup pg);
	ProductGroup update(long id,ProductGroup pg);
	boolean delete(long id);
	ProductGroup getById(long id);
	List<ProductGroup> getAll();
}
