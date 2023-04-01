package com.hha.entities;

import javax.persistence.*;
@Entity
public class ProductType extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column(name="gen_id")//product type code
	private String genId;

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
	public ProductType(long id, String name, String genId) {
		super();
		this.id = id;
		this.name = name;
		this.genId = genId;
	}
	public ProductType() {}
}
