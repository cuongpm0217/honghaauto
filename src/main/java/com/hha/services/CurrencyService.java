package com.hha.services;

import java.util.List;

import com.hha.entities.Currency;

public interface CurrencyService {
	Currency create(Currency cur);
	Currency update(long id,Currency cur);
	void delete(long id);
	void hidden(long id);
	Currency getById(long id);
	List<Currency> getAll();
}
