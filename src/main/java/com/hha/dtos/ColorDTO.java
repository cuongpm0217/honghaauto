package com.hha.dtos;

public class ColorDTO extends BaseDTO{
	private long id;

	private String name;

	private String rgb;

	private String code;

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

	public String getRgb() {
		return rgb;
	}

	public void setRgb(String rgb) {
		this.rgb = rgb;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ColorDTO(long id, String name, String rgb, String code) {
		super();
		this.id = id;
		this.name = name;
		this.rgb = rgb;
		this.code = code;
	}

	public ColorDTO() {
	}
}
