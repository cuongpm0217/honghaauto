package com.hha.services;

import java.util.List;

import com.hha.entities.ProductVideo;

public interface ProductVideoService {
	ProductVideo create(ProductVideo pv);

	ProductVideo update(long id, ProductVideo pv);

	void delete(long id);

	boolean hidden(long id);

	ProductVideo getById(long id);

	List<ProductVideo> getAll();

	List<ProductVideo> getAllByProductId(long id);

	List<ProductVideo> getAllByVideoId(long id);
}
