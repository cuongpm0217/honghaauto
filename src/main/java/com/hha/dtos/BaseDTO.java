package com.hha.dtos;

import java.util.Date;

import com.hha.utils.Converter;

public class BaseDTO {
	private Date createDate;
	private Date modifyDate;
	private long userCreate;
	private long userModify;
	private long branchId;
	private String txtCreateDate;
	private String txtModifyDate;
	private Converter convert;
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
	public String getTxtCreateDate() {
		txtCreateDate = convert.txtDMYHH(this.createDate);
		return txtCreateDate;
	}

	public void setTxtCreateDate(Date createDate) {
		this.txtCreateDate = convert.txtDMYHH(createDate);
	}

	public String getTxtModifyDate() {
		txtModifyDate = convert.txtDMYHH(this.modifyDate);
		return txtModifyDate;
	}

	public void setTxtModifyDate(Date modifyDate) {
		this.txtModifyDate = convert.txtDMYHH(modifyDate);
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
		convert = new Converter();
	}
}
