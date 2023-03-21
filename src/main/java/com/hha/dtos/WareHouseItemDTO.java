package com.hha.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WareHouseItemDTO extends BaseDTO{
	
	
	private long id;
	
	private String name;//Fixed assets,accessary,equipment
}
