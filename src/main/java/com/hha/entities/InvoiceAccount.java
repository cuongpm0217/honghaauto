package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class InvoiceAccount extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,name="invoice_id")
	private long invoiceId;
	@Column(nullable=false,name="account_credit_id")
	private long accountCreditId;
	@Column(nullable=false,name="credit_balance")
	private long creditBalance;
	@Column(nullable=false,name="account_debit_id")
	private long accountDebitId;
	@Column(nullable=false,name="debit_balance")
	private long debitBalance;
	
}
