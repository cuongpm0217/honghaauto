package com.hha.dtos;

public class ProductGroupDTO {

	private long id;

	private String name;
	// code
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

	public ProductGroupDTO(long id, String name, String genId) {
		super();
		this.id = id;
		this.name = name;
		this.genId = genId;
	}

	public ProductGroupDTO() {
	}
}
