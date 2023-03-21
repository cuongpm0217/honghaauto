package com.hha.dtos;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EmployeeDTO extends BaseDTO{
	
	private long id;

	private String name;

	private String genId;

	private String nationId;

	private String tel1;

	private String tel2;

	private Date DOB;

	private String add1;

	private String add2;

	private long salary;

	private String bankAcc1;

	private String bankAcc2;

	private String position;

	private int lever;//0-9 des

	private long userId;

	private long depId;
	
}
