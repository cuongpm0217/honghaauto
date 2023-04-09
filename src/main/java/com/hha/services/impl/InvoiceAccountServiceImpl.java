package com.hha.services.impl;

import com.hha.entities.InvoiceAccount;
import com.hha.repository.InvoiceAccountRepository;
import com.hha.services.InvoiceAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceAccountServiceImpl implements InvoiceAccountService {
    @Autowired
    InvoiceAccountRepository iaRepo;

    @Override
    public InvoiceAccount createInvoiceAccount(InvoiceAccount ia) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InvoiceAccount updateInvoiceAccount(long id, InvoiceAccount ia) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteInvoiceAccount(long id) {
        iaRepo.deleteById(id);
    }

    @Override
    public boolean hidden(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public InvoiceAccount getInvoiceAccountById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceAccount> getAllInvoiceAccount() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceAccount> getAllByInvoiceId(long invoiceId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceAccount> getAllByAccountDebitId(long accountId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceAccount> getAllByAccountCreditId(long accountId) {
        // TODO Auto-generated method stub
        return null;
    }

}
