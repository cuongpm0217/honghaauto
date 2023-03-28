package com.hha.dtos;

import java.util.Date;

public class ProductGroupDTO extends BaseDTO {

	private long id;

	private String name;
	// code
	private String genId;

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

	public String getGenId() {
		return genId;
	}

	public void setGenId(String genId) {
		this.genId = genId;
	}

	public ProductGroupDTO() {
	}

	public ProductGroupDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, String name, String genId) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;
		this.genId = genId;
	}
	
}
