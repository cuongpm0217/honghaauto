package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;

public class BaseEntity {
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modify_date")
	private Date modifyDate;
	@Column(name = "user_create")
	private long userCreate;
	@Column(name = "user_modify")
	private long userModify;
	@Column(name = "branch_id")
	private long branchId;
	@Column(name="is_enable")
	private boolean isEnable;
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
	
	public boolean isEnable() {
		return isEnable;
	}
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	public BaseEntity()
	{		
	}
	public BaseEntity(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable) {
		super();
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.userCreate = userCreate;
		this.userModify = userModify;
		this.branchId = branchId;
		this.isEnable = isEnable;
	}
	
	
}
