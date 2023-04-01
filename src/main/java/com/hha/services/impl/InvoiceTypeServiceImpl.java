package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.InvoiceType;
import com.hha.repository.InvoiceTypeRepository;
import com.hha.services.InvoiceTypeService;

@Service
public class InvoiceTypeServiceImpl implements InvoiceTypeService{
	@Autowired
	private InvoiceTypeRepository invTypeRepo;
	@Override
	public InvoiceType create(InvoiceType invT) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceType update(long id, InvoiceType invT) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		invTypeRepo.deleteById(id);
		
	}

	@Override
	public boolean hidden(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InvoiceType getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceType> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
