package com.hha.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class InvoiceDetail extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,name="inv_id")
	private long invId;
	@Column(nullable=false,name="prd_id")
	private long prdId;
	@Column
	private int quantity;
	@Column
	private long cost;
	@Column
	private long total;
	@Column
	private String note;
	
}
