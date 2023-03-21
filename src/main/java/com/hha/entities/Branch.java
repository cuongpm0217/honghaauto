package com.hha.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "gen_Id")
	private String genId;
	@Column(name = "lever")
	private int lever;//	0-9 des
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modify_date")
	private Date modifyDate;
	@Column(name = "user_create")
	private long userCreate;
	@Column(name = "user_modify")
	private long userModify;
	
}
