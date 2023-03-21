package com.hha.services;

import java.util.List;

import com.hha.entities.InvoiceAccount;

public interface InvoiceAccountService {
	InvoiceAccount createInvoiceAccount(InvoiceAccount ia);
	InvoiceAccount updateInvoiceAccount(long id,InvoiceAccount ia);
	boolean deleteInvoiceAccount(InvoiceAccount ia);
	InvoiceAccount getInvoiceAccountById(long id);
	List<InvoiceAccount> getAllInvoiceAccount();
	List<InvoiceAccount> getAllByInvoiceId(long invoiceId);
	List<InvoiceAccount> getAllByAccountDebitId(long accountId);
	List<InvoiceAccount> getAllByAccountCreditId(long accountId);
}
