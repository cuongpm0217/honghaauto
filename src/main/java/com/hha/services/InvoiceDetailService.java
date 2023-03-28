package com.hha.services;

import java.util.List;

import com.hha.entities.InvoiceDetail;

public interface InvoiceDetailService {
	InvoiceDetail createInvoiceDetail(InvoiceDetail invd);

	InvoiceDetail updateInvoiceDetail(long id, InvoiceDetail invd);

	void deleteInvoiceDetail(long id);

	void hidden(long id);

	InvoiceDetail getById(long id);

	List<InvoiceDetail> getAll();

	List<InvoiceDetail> getByInvoiceId(long invoiceId);
}
