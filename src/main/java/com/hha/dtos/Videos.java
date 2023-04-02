package com.hha.dtos;

import java.util.Date;

public class Videos extends BaseDTO{
	private long id;
	private String tittle;
	private String description;
	private String url;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Videos() {
		
	}
	public Videos(long id, String tittle, String description, String url) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.url = url;
	}
	
}
