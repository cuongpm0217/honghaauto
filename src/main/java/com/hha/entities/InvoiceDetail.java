package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class InvoiceDetail extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,name="invoice_id")
	private long invoiceId;
	@Column(nullable=false,name="product_id")
	private long productId;
	@Column
	private int quantity;
	@Column
	private long cost;	
	@Column
	private String note;
	
}
