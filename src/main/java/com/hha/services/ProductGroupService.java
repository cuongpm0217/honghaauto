package com.hha.services;

import com.hha.entities.ProductGroup;

import java.util.List;

public interface ProductGroupService {
	ProductGroup create(ProductGroup pg);

	ProductGroup update(long id, ProductGroup pg);

	void delete(long id);

	boolean hidden(long id);

	ProductGroup getById(long id);

	List<ProductGroup> getAll();

	List<ProductGroup> getAllByProductId(long id);

	List<ProductGroup> getAllByGroupId(long id);
}
