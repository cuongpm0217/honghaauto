package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String code;
	@Column
	private String name;
	@Column
	private int lever;//0-2:sub-account, account example: 131,1311
	@Column(name="is_enable")
	private boolean isEnable;
	
	public boolean isEnable() {
		return isEnable;
	}
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLever() {
		return lever;
	}
	public void setLever(int lever) {
		this.lever = lever;
	}
	public Account() {}
	public Account(long id, String code, String name, int lever) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.lever = lever;
	}
	
}
