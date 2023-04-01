package com.hha.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hha.entities.Partner;
import com.hha.repository.PartnerRepository;
import com.hha.services.PartnerService;

@Service
public class PartnerServiceImpl implements PartnerService{
	@Autowired
	private PartnerRepository partnerRepo;
	@Override
	public Partner create(Partner p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Partner update(long id, Partner p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		partnerRepo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Partner getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Partner> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
