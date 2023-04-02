package com.hha.services;

import java.util.List;

import com.hha.entities.ProductColor;

public interface ProductColorService {
	ProductColor create(ProductColor pc);

	ProductColor update(long id, ProductColor pc);

	void delete(long id);

	boolean hidden(long id);

	ProductColor getById(long id);

	List<ProductColor> getAll();
}
