package com.hha.services;

import com.hha.entities.Invoice;

import java.util.List;

public interface InvoiceService {
	Invoice create(Invoice inv);

	Invoice update(long id, Invoice inv);

	void delete(long id);

	void hidden(long id);

	Invoice getById(long id);

	List<Invoice> getAll();

	List<Invoice> getByDate(String date2search);

	List<Invoice> getByCustomerId(long customerId);
}
