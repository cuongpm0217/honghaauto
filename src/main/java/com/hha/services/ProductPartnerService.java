package com.hha.services;

import com.hha.entities.ProductPartner;

import java.util.List;

public interface ProductPartnerService {
    ProductPartner create(ProductPartner pp);

    ProductPartner update(long id, ProductPartner pp);

    void delete(long id);

    boolean hidden(long id);

    ProductPartner getById(long id);

    List<ProductPartner> getAll();

    List<ProductPartner> getAllByProductId(long id);

    List<ProductPartner> getAllByPartnerId(long id);
}
