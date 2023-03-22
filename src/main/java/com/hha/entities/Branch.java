package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column(name = "gen_Id")
	private String genId;
	@Column(name = "lever")
	private int lever;//	0-9 des
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modify_date")
	private Date modifyDate;
	@Column(name = "user_create")
	private long userCreate;
	@Column(name = "user_modify")
	private long userModify;
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
	public int getLever() {
		return lever;
	}
	public void setLever(int lever) {
		this.lever = lever;
	}
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
	public Branch() {
		
	}
	public Branch(long id, String name, String genId, int lever, Date createDate, Date modifyDate, long userCreate,
			long userModify) {
		this.id = id;
		this.name = name;
		this.genId = genId;
		this.lever = lever;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.userCreate = userCreate;
		this.userModify = userModify;
	}
	
}
