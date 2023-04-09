package com.hha.dtos;

import java.util.Date;

public class InvoiceAccountDTO extends BaseDTO {

    private long id;

    private long invoiceId;

    private long accountCreditId;

    private long creditBalance;

    private long accountDebitId;

    private long debitBalance;

    public InvoiceAccountDTO() {
    }

    public InvoiceAccountDTO(long id, long invoiceId, long accountCreditId, long creditBalance, long accountDebitId,
			long debitBalance) {
		super();
		this.id = id;
		this.invoiceId = invoiceId;
		this.accountCreditId = accountCreditId;
		this.creditBalance = creditBalance;
		this.accountDebitId = accountDebitId;
		this.debitBalance = debitBalance;
	}

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
}
