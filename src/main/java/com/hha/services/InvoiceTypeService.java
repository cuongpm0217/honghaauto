package com.hha.services;

import com.hha.entities.InvoiceType;

import java.util.List;

public interface InvoiceTypeService {
	InvoiceType create(InvoiceType invT);

	InvoiceType update(long id, InvoiceType invT);

	void delete(long id);

	boolean hidden(long id);

	InvoiceType getById(long id);

	List<InvoiceType> getAll();
}
