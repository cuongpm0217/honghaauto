package com.hha.services;

import com.hha.entities.Images;

import java.util.List;

public interface ImagesService {
    Images create(Images image);

    Images update(long id, Images image);

    void delete(long id);

    boolean hidden(long id);

    Images getById(long id);

    List<Images> getAll();
}
