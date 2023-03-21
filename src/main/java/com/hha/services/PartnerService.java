package com.hha.services;

import java.util.List;

import com.hha.entities.Partner;

public interface PartnerService {
	Partner create(Partner p);
	Partner update(long id,Partner p);
	boolean delete(long id);
	Partner getById(long id);
	List<Partner> getAll();

}
