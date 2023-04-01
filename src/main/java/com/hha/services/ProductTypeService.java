package com.hha.services;

import com.hha.entities.ProductType;

import java.util.List;

public interface ProductTypeService {
	ProductType create(ProductType pt);

	ProductType update(long id, ProductType pt);

	void delete(long id);

	void hidden(long id);

	ProductType getById(long id);

	List<ProductType> getAll();
}
