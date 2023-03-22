package com.hha.dtos;

public class CurrencyDTO {
	private long id;

	private String code;// exp:VND ...

	private String name;// Vietnam Dong

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

	public CurrencyDTO(long id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public CurrencyDTO() {
	}
}
