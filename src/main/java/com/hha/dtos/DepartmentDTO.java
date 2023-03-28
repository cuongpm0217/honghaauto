package com.hha.dtos;

import java.util.Date;

public class DepartmentDTO extends BaseDTO {

	private long id;

	private String depName;

	private String depGenId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepGenId() {
		return depGenId;
	}

	public void setDepGenId(String depGenId) {
		this.depGenId = depGenId;
	}

	public DepartmentDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, boolean isEnable, long id,
			String depName, String depGenId) {
		super(createDate, modifyDate, userCreate, userModify, branchId,isEnable);
		this.id = id;
		this.depName = depName;
		this.depGenId = depGenId;
	}

	public DepartmentDTO() {
	}

}
