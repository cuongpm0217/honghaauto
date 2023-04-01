package com.hha.entities;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createDate;
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date modifyDate;
	@CreatedBy
	protected long userCreate;
	@LastModifiedBy
	protected long userModify;
	@Column(name = "branch_id")
	protected long branchId;
	@Column(name="is_enable")
	protected boolean isEnable;
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
	public BaseEntity(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable) {		
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.userCreate = userCreate;
		this.userModify = userModify;
		this.branchId = branchId;
		this.isEnable = isEnable;
	}
	public BaseEntity() {
		
	}
	
	
}
