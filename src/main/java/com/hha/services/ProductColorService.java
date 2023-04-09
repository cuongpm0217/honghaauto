package com.hha.services;

import com.hha.entities.ProductColor;

import java.util.List;

public interface ProductColorService {
    ProductColor create(ProductColor pc);

    ProductColor update(long id, ProductColor pc);

    void delete(long id);

    boolean hidden(long id);

    ProductColor getById(long id);

    List<ProductColor> getAll();

    List<ProductColor> getAllByProductId(long id);

    List<ProductColor> getAllByColorId(long id);
}
