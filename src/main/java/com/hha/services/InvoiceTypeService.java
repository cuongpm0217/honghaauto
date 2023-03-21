package com.hha.services;

import java.util.List;

import com.hha.entities.InvoiceType;

public interface InvoiceTypeService {
	InvoiceType create(InvoiceType invT);
	InvoiceType update(long id,InvoiceType invT);
	boolean delete(long id);
	InvoiceType getById(long id);
	List<InvoiceType> getAll();
}
