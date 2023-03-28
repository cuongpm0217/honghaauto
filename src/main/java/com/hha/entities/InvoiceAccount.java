package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class InvoiceAccount extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, name = "invoice_id")
	private long invoiceId;
	@Column(nullable = false, name = "account_credit_id")
	private long accountCreditId;
	@Column(nullable = false, name = "credit_balance")
	private long creditBalance;
	@Column(nullable = false, name = "account_debit_id")
	private long accountDebitId;
	@Column(nullable = false, name = "debit_balance")
	private long debitBalance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public long getAccountCreditId() {
		return accountCreditId;
	}

	public void setAccountCreditId(long accountCreditId) {
		this.accountCreditId = accountCreditId;
	}

	public long getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(long creditBalance) {
		this.creditBalance = creditBalance;
	}

	public long getAccountDebitId() {
		return accountDebitId;
	}

	public void setAccountDebitId(long accountDebitId) {
		this.accountDebitId = accountDebitId;
	}

	public long getDebitBalance() {
		return debitBalance;
	}

	public void setDebitBalance(long debitBalance) {
		this.debitBalance = debitBalance;
	}

	public InvoiceAccount() {
	}

	public InvoiceAccount(long id, long invoiceId, long accountCreditId, long creditBalance, long accountDebitId,
			long debitBalance) {
		super();
		this.id = id;
		this.invoiceId = invoiceId;
		this.accountCreditId = accountCreditId;
		this.creditBalance = creditBalance;
		this.accountDebitId = accountDebitId;
		this.debitBalance = debitBalance;
	}

}
