package com.hha.dtos;

public class CurrencyDTO {
	private long id;

	private String code;// exp:VND ...

	private String name;// Vietnam Dong
	private boolean isEnable;

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CurrencyDTO(long id, String code, String name,boolean isEnable) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.isEnable = isEnable;
	}

	public CurrencyDTO() {
	}
}
