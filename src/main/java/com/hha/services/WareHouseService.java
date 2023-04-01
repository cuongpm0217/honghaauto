package com.hha.services;

import com.hha.entities.WareHouse;

import java.util.List;

public interface WareHouseService {
	WareHouse create(WareHouse wh);

	WareHouse update(long id, WareHouse wh);

	void delete(long id);

	void hidden(long id);

	WareHouse getById(long id);

	List<WareHouse> getAll();
}
