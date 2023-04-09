package com.hha.dtos;

import java.util.Date;

public class InvoiceDetailDTO extends BaseDTO {

    private long id;

    private long invoiceId;

    private long productId;

    private int quantity;

    private long cost;

    private String note;

    public InvoiceDetailDTO() {
    }

    public InvoiceDetailDTO(long id, long invoiceId, long productId, int quantity, long cost, String note) {
		super();
		this.id = id;
		this.invoiceId = invoiceId;
		this.productId = productId;
		this.quantity = quantity;
		this.cost = cost;
		this.note = note;
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

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
