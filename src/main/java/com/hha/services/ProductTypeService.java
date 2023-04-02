package com.hha.services;

import com.hha.entities.ProductType;

import java.util.List;

public interface ProductTypeService {
	ProductType create(ProductType pt);

	ProductType update(long id, ProductType pt);

	void delete(long id);

	boolean hidden(long id);

	ProductType getById(long id);

	List<ProductType> getAll();

	List<ProductType> getAllByProductId(long id);

	List<ProductType> getAllByTypeId(long id);
}
