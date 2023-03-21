package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class WareHouse extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,name="product_id")
	private long productId;
	@Column(nullable=false,name="item_type_id")
	private long itemTypeId;
	@Column(name="date_input")
	private Date dateInput;
	@Column(name="date_output")
	private Date dateOutput;
	@Column(name="invoice_detail_id")
	private long invoiceDetailId;
}
