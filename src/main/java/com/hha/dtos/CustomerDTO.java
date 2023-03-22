package com.hha.dtos;

import java.util.Date;

public class CustomerDTO extends BaseDTO {

	private long id;

	private String name;

	private String genId;

	private String tel1;

	private String tel2;

	private Date DOB;

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

	public String getGenId() {
		return genId;
	}

	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public CustomerDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, long id,
			String name, String genId, String tel1, String tel2, Date dOB) {
		super(createDate, modifyDate, userCreate, userModify, branchId);
		this.id = id;
		this.name = name;
		this.genId = genId;
		this.tel1 = tel1;
		this.tel2 = tel2;
		DOB = dOB;
	}

	public CustomerDTO() {

	}

}
