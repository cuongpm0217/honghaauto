package com.hha.services;

import com.hha.entities.InvoiceAccount;

import java.util.List;

public interface InvoiceAccountService {
    InvoiceAccount createInvoiceAccount(InvoiceAccount ia);

    InvoiceAccount updateInvoiceAccount(long id, InvoiceAccount ia);

    void deleteInvoiceAccount(long id);

    boolean hidden(long id);

    InvoiceAccount getInvoiceAccountById(long id);

    List<InvoiceAccount> getAllInvoiceAccount();

    List<InvoiceAccount> getAllByInvoiceId(long invoiceId);

    List<InvoiceAccount> getAllByAccountDebitId(long accountId);

    List<InvoiceAccount> getAllByAccountCreditId(long accountId);
}
