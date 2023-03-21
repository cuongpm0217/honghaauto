package com.hha.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvoiceDetail extends BaseDTO{
	
	
	private long id;

	private long invoiceId;

	private long productId;
	
	private int quantity;
	
	private long cost;	
	
	private String note;
	
}
