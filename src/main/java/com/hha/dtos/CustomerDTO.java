package com.hha.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomerDTO extends BaseDTO{
	
	
	private long Id;
	
	private String name;
	
	private String genId;
	
	private String tel1;
	
	private String tel2;
	
	private Date DOB;
}
