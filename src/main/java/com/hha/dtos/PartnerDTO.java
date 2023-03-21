package com.hha.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PartnerDTO extends BaseDTO{
	
	private long id;
	
	private String name;
	
	private String tel1;
	
	private String tel2;
	
	private String add1;
	
	private String add2;
}
