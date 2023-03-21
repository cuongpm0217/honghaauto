package com.hha.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductTypeDTO extends BaseDTO{
	
	
	private long id;
	
	private String name;
	//product type code
	private String genId;
}
