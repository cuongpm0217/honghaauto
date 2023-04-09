package com.hha.services;

import com.hha.entities.ProductVideo;

import java.util.List;

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
