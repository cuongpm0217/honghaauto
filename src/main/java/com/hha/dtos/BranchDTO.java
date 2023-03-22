package com.hha.dtos;

import java.util.Date;

public class BranchDTO {
	private Date createDate;
	private String genId;

	private long id;

	private int lever;// 0-9 des

	private Date modifyDate;

	private String name;

	private long userCreate;

	private long userModify;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getGenId() {
		return genId;
	}

	public void setGenId(String genId) {
		this.genId = genId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLever() {
		return lever;
	}

	public void setLever(int lever) {
		this.lever = lever;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public BranchDTO(Date createDate, String genId, long id, int lever, Date modifyDate, String name, long userCreate,
			long userModify) {
		super();
		this.createDate = createDate;
		this.genId = genId;
		this.id = id;
		this.lever = lever;
		this.modifyDate = modifyDate;
		this.name = name;
		this.userCreate = userCreate;
		this.userModify = userModify;
	}

	public BranchDTO() {
	}
}
