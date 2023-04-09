package com.hha.services;

import com.hha.entities.Type;

import java.util.List;

public interface TypeService {
    Type create(Type type);

    Type update(long id, Type type);

    void delete(long id);

    boolean hidden(long id);

    Type getById(long id);

    List<Type> getAll();
}
