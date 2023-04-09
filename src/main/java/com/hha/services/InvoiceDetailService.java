package com.hha.services;

import com.hha.entities.InvoiceDetail;

import java.util.List;

public interface InvoiceDetailService {
    InvoiceDetail createInvoiceDetail(InvoiceDetail invd);

    InvoiceDetail updateInvoiceDetail(long id, InvoiceDetail invd);

    void deleteInvoiceDetail(long id);

    boolean hidden(long id);

    InvoiceDetail getById(long id);

    List<InvoiceDetail> getAll();

    List<InvoiceDetail> getByInvoiceId(long invoiceId);
}
