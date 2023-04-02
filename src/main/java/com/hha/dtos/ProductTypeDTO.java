package com.hha.dtos;

public class ProductTypeDTO extends BaseDTO {

	private long id;

	private String name;
	// product type code
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

	public ProductTypeDTO() {
	}

	public ProductTypeDTO(long id, String name, String genId) {
		this.id = id;
		this.name = name;
		this.genId = genId;
	}

}
