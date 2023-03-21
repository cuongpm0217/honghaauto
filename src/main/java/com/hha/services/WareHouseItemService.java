package com.hha.services;

import java.util.List;

import com.hha.entities.WareHouseItem;

public interface WareHouseItemService {
	WareHouseItem create(WareHouseItem whi);
	WareHouseItem update(long id,WareHouseItem whi);
	boolean delete(long id);
	WareHouseItem getById(long id);
	List<WareHouseItem> getAll();
}
