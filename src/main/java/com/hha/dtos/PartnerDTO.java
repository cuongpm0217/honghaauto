package com.hha.dtos;

import java.util.Date;

public class PartnerDTO extends BaseDTO {

	private long id;

	private String name;

	private String tel1;

	private String tel2;

	private String add1;

	private String add2;

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

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public PartnerDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, String name, String tel1, String tel2, String add1, String add2) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.add1 = add1;
		this.add2 = add2;
	}

	public PartnerDTO() {
	}
}
