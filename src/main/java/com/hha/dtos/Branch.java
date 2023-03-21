package com.hha.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Branch {
	private Date createDate;
	private String genId;

	private long id;

	private int lever;// 0-9 des

	private Date modifyDate;

	private String name;

	private long userCreate;

	private long userModify;

}
