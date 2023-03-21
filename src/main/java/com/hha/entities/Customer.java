package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
