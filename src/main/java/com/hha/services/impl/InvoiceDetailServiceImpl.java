package com.hha.services.impl;

import com.hha.entities.InvoiceDetail;
import com.hha.repository.InvoiceDetailRepository;
import com.hha.services.InvoiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceDetailServiceImpl implements InvoiceDetailService {
    @Autowired
    private InvoiceDetailRepository idRepo;

    @Override
    public InvoiceDetail createInvoiceDetail(InvoiceDetail invd) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InvoiceDetail updateInvoiceDetail(long id, InvoiceDetail invd) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteInvoiceDetail(long id) {
        idRepo.deleteById(id);
    }

    @Override
    public boolean hidden(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public InvoiceDetail getById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceDetail> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceDetail> getByInvoiceId(long invoiceId) {
        // TODO Auto-generated method stub
        return null;
    }

}
