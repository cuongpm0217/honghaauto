package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvoiceDetail extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, name = "invoice_id")
	private long invoiceId;
	@Column(nullable = false, name = "product_id")
	private long productId;
	@Column
	private int quantity;
	@Column
	private long cost;
	@Column
	private String note;

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

	public InvoiceDetail() {
	}

	public InvoiceDetail(long id, long invoiceId, long productId, int quantity, long cost, String note) {
		super();
		this.id = id;
		this.invoiceId = invoiceId;
		this.productId = productId;
		this.quantity = quantity;
		this.cost = cost;
		this.note = note;
	}

}
