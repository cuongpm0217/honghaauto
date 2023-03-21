package com.hha.services;

import java.util.List;

import com.hha.entities.ProductType;

public interface ProductTypeService {
	ProductType create(ProductType pt);
	ProductType update(long id,ProductType pt);
	boolean delete(long id);
	ProductType getById(long id);
	List<ProductType> getAll();
}
