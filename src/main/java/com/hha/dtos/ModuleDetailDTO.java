package com.hha.dtos;

import java.util.Date;

public class ModuleDetailDTO extends BaseDTO {
	private long id;

	private String name;

	private long moduleId;

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

	public long getModuleId() {
		return moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}

	public ModuleDetailDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, String name, long moduleId) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;
		this.moduleId = moduleId;
	}

	public ModuleDetailDTO(long id, String name, long moduleId) {
		this.id = id;
		this.name = name;
		this.moduleId = moduleId;
	}

	public ModuleDetailDTO() {

	}

}
