package com.hha.services;

import com.hha.entities.Combination;

import java.util.List;

public interface CombinationService {
    Combination create(Combination combination);

    Combination update(long id, Combination combination);

    void delete(long id);

    boolean hidden(long id);

    Combination getById(long id);

    List<Combination> getAll();
}
