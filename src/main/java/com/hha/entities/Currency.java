package com.hha.entities;

import javax.persistence.*;

@Entity

public class Currency extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String code;// exp:VND ...
	@Column
	private String name;// VietNamDong

	@Column(name = "rate") // exchange rate
	private double rate;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
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

	public Currency() {
	}

	public Currency(long id, String code, String name, double rate) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.rate = rate;
	}

}
