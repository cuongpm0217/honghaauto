package com.hha.dtos;

import java.util.Date;

public class RoleDTO extends BaseDTO {
	private long id;
	private String name;

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
	
	public RoleDTO() {
	}

	public RoleDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public RoleDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, boolean isEnable, long id, String name) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;
	}
}
