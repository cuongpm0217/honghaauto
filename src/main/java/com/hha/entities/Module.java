package com.hha.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Module extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Autowired
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "module_permission", joinColumns = @JoinColumn(name = "module_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private List<Permission> permissions;
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
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public Module() {
		
	}
	public Module(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, boolean isEnable,
			long id, String name, List<Permission> permissions) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;
		this.permissions = permissions;
	}
	
	
}
