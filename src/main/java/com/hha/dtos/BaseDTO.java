package com.hha.dtos;

import java.util.Date;

public class BaseDTO {
	private Date createDate;
	private Date modifyDate;
	private long userCreate;
	private long userModify;
	private long branchId;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public long getUserCreate() {
		return userCreate;
	}

	public void setUserCreate(long userCreate) {
		this.userCreate = userCreate;
	}

	public long getUserModify() {
		return userModify;
	}

	public void setUserModify(long userModify) {
		this.userModify = userModify;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public BaseDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId) {
		super();
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.userCreate = userCreate;
		this.userModify = userModify;
		this.branchId = branchId;
	}

	public BaseDTO() {
	}
}
