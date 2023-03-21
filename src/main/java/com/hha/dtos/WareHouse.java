package com.hha.dtos;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WareHouse extends BaseDTO{
	
	
	private long id;

	private long productId;

	private long itemTypeId;

	private Date dateInput;

	private Date dateOutput;

	private long invoiceDetailId;
}
