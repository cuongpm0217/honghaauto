package com.hha.dtos;

import java.util.Date;

public class BranchDTO extends BaseDTO {
	private long id;

	private String genId;

	private int lever;// 0-9 des

	private String name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenId() {
		return genId;
	}

	public void setGenId(String genId) {
		this.genId = genId;
	}

	public int getLever() {
		return lever;
	}

	public void setLever(int lever) {
		this.lever = lever;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchDTO( long id,String genId, int lever, Date modifyDate, String name) {
		this.genId = genId;
		this.id = id;
		this.lever = lever;
		this.name = name;

	}

	public BranchDTO() {
		
	}

}
