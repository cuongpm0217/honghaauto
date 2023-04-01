package com.hha.entities;

import javax.persistence.*;

@Entity
public class Permission extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	@Column(length=50)
	private EPermission action;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EPermission getAction() {
		return action;
	}

	public void setAction(EPermission action) {
		this.action = action;
	}

	public Permission(long id, EPermission action) {
		super();
		this.id = id;
		this.action = action;
	}

	public Permission() {
	}
}
