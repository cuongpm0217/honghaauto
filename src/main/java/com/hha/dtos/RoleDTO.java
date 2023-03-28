package com.hha.dtos;

public class RoleDTO {
	private long id;
	private String name;
	private boolean isEnable;
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
	
	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public RoleDTO() {
	}

	public RoleDTO(long id, String name, boolean isEnable) {
		super();
		this.id = id;
		this.name = name;
		this.isEnable = isEnable;
	}

}
