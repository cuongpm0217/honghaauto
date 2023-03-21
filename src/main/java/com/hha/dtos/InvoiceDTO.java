package com.hha.dtos;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvoiceDTO extends BaseDTO{
	
	
	private long id;

	private long typeId;

	private long cusId;

	private long empId;
	
	private String tittle;
	
	private long total;

	private Date startedDate;

	private Date endDate;

	private String logoUrl;

	private String telBranch;

	private String addBranch;

	private String bankAcc1;

	private String bankAcc2;		
}
