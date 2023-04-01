package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Module extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
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
	
	public Module() {
		
	}
	public Module(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, boolean isEnable,
			long id, String name) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;		
	}
	
	
}
