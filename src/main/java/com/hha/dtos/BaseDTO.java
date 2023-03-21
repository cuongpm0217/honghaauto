package com.hha.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BaseDTO {
	private Date createDate;
	private Date modifyDate;
	private long userCreate;	
	private long userModify;	
	private long branchId;
}
