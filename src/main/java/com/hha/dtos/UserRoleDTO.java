package com.hha.dtos;

public class UserRoleDTO {
	private long userId;
	private long roleId;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public UserRoleDTO(long userId, long roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}
	public UserRoleDTO() {}
}
