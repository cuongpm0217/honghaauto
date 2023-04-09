package com.hha.services;

import com.hha.entities.ProductImage;

import java.util.List;

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
