package com.hha.dtos;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Product extends BaseDTO {
	
	
	private long Id;

	private String name;
	//product code
	private String genId;
	
	private long typeId;
	
	private long colorId;
	
	private long groupId;
	
	private long costIn;
	
	private long costOut;
	
	private long imageGroupId;
	
	private int guarantee;//by month
	
	private Date expiry;
	
	private long partnerId;
}
