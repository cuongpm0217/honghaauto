package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class WareHouseItem extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Enumerated(EnumType.STRING)
	@Column(length=50)
	private EWareHouseItem name;// Fixed assets,accessary ,equipment

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EWareHouseItem getName() {
		return name;
	}

	public void setName(EWareHouseItem name) {
		this.name = name;
	}

	public WareHouseItem(long id, EWareHouseItem name) {		
		this.id = id;
		this.name = name;
	}

	public WareHouseItem() {
	}
}
