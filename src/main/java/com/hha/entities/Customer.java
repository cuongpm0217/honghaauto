package com.hha.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Customer extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="name")
	private String name;
	@Column(name="gen_id")
	private String genId;
	@Column(name="tel1")
	private String tel1;
	@Column(name="tel2")
	private String tel2;
	@Column(name="dob")
	private Date DOB;
}
