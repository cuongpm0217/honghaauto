package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="gen_id")
	private String genId;
	@Column
	private String name;
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
	public Group() {
		
	}
	public Group(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, boolean isEnable,
			long id, String genId, String name) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.genId = genId;
		this.name = name;
	}
	public Group(long id, String genId, String name) {
		super();
		this.id = id;
		this.genId = genId;
		this.name = name;
	}
	
}
