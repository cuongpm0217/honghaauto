package com.hha.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvoiceAccount extends BaseDTO{
	
	
	private long id;

	private long invoiceId;

	private long accountCreditId;

	private long creditBalance;

	private long accountDebitId;

	private long debitBalance;
	
}
