package com.hha.services;

import com.hha.entities.WareHouseItem;

import java.util.List;

public interface WareHouseItemService {
	WareHouseItem create(WareHouseItem whi);

	WareHouseItem update(long id, WareHouseItem whi);

	void delete(long id);

	boolean hidden(long id);

	WareHouseItem getById(long id);

	List<WareHouseItem> getAll();
}
