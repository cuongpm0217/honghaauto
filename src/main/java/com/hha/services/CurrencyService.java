package com.hha.services;

import com.hha.entities.Currency;

import java.util.List;

public interface CurrencyService {
    Currency create(Currency cur);

    Currency update(long id, Currency cur);

    void delete(long id);

    boolean hidden(long id);

    Currency getById(long id);

    List<Currency> getAll();
}
