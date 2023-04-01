package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class WareHouse extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, name = "product_id")
	private long productId;
	@Column(nullable = false, name = "item_type_id")
	private long itemTypeId;
	@Column(name = "date_input")
	private Date dateInput;
	@Column(name = "date_output")
	private Date dateOutput;
	@Column(name = "invoice_detail_id")
	private long invoiceDetailId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(long itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public Date getDateInput() {
		return dateInput;
	}

	public void setDateInput(Date dateInput) {
		this.dateInput = dateInput;
	}

	public Date getDateOutput() {
		return dateOutput;
	}

	public void setDateOutput(Date dateOutput) {
		this.dateOutput = dateOutput;
	}

	public long getInvoiceDetailId() {
		return invoiceDetailId;
	}

	public void setInvoiceDetailId(long invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public WareHouse(long id, long productId, long itemTypeId, Date dateInput, Date dateOutput, long invoiceDetailId) {
		super();
		this.id = id;
		this.productId = productId;
		this.itemTypeId = itemTypeId;
		this.dateInput = dateInput;
		this.dateOutput = dateOutput;
		this.invoiceDetailId = invoiceDetailId;
	}

	public WareHouse() {
	}
}
