package com.hha.services;

import java.util.List;

import com.hha.entities.ProductImage;

public interface ProductImageService {
	ProductImage create(ProductImage pi);

	ProductImage update(long id, ProductImage pi);

	void delete(long id);

	boolean hidden(long id);

	ProductImage getById(long id);

	List<ProductImage> getAll();

	List<ProductImage> getAllByProductId(long proId);

	List<ProductImage> getAllByImageId(long imgId);
}
