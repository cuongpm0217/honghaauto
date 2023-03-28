package com.hha.services;

import java.util.List;

import com.hha.entities.WareHouse;

public interface WareHouseService {
	WareHouse create(WareHouse wh);

	WareHouse update(long id, WareHouse wh);

	void delete(long id);

	void hidden(long id);

	WareHouse getById(long id);

	List<WareHouse> getAll();
}
