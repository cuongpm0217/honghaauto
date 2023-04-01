package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ModuleDetail extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column(name = "module_id", nullable = false)
	private long moduleId;

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

	public long getModuleId() {
		return moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}

	public ModuleDetail(long id, String name, long moduleId) {

		this.id = id;
		this.name = name;
		this.moduleId = moduleId;
	}

	public ModuleDetail(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, String name, long moduleId) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.name = name;
		this.moduleId = moduleId;
	}

	public ModuleDetail() {

	}
}
