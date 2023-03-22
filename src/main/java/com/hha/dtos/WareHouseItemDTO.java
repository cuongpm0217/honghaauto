package com.hha.dtos;

import java.util.Date;

public class WareHouseItemDTO extends BaseDTO {

	private long id;

	private String name;// Fixed assets,accessary,equipment

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WareHouseItemDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, long id,
			String name) {
		super(createDate, modifyDate, userCreate, userModify, branchId);
		this.id = id;
		this.name = name;
	}

	public WareHouseItemDTO() {
	}
}
