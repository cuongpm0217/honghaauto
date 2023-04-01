package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.Invoice;
import com.hha.repository.InvoiceRepository;
import com.hha.services.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{
	@Autowired
	private InvoiceRepository invRepo;
	@Override
	public Invoice create(Invoice inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice update(long id, Invoice inv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		invRepo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Invoice getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getByDate(String date2search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getByCustomerId(long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
