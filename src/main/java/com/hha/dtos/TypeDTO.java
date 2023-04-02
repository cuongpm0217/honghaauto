package com.hha.dtos;

import java.util.Date;

public class TypeDTO extends BaseDTO{
	private long id;
	private String genId;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getGenId() {
		return genId;
	}
	public void setGenId(String genId) {
		this.genId = genId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public TypeDTO() {
		
	}
	
	public TypeDTO(long id, String genId, String name) {		
		this.id = id;
		this.genId = genId;
		this.name = name;
	}
	
}
