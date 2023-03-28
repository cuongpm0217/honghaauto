package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "dep_name")
	private String depName;
	@Column(name="dep_genid")
	private String depGenId;
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
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepGenId() {
		return depGenId;
	}
	public void setDepGenId(String depGenId) {
		this.depGenId = depGenId;
	}
	public Department() {}
	public Department(long id, String depName, String depGenId) {
		super();
		this.id = id;
		this.depName = depName;
		this.depGenId = depGenId;
	}
	
	
}
