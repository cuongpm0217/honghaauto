package com.hha.dtos;

import java.util.Date;

import com.hha.utils.Converter;

public class WareHouseDTO extends BaseDTO {
	private long id;
	private long productId;
	private long itemTypeId;
	private Date dateInput;
	private Date dateOutput;
	private String txtDateInput;
	private String txtDateOutput;	
	private long invoiceDetailId;
	private Converter convert;
	
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

	public String getTxtDateInput() {
		txtDateInput = convert.txtDMYHH(this.dateInput);
		return txtDateInput;
	}

	public void setTxtDateInput(String txtDateInput) {
		this.txtDateInput = convert.txtDMYHH(this.dateInput);
	}

	public String getTxtDateOutput() {
		txtDateOutput = convert.txtDMYHH(this.dateOutput);
		return txtDateOutput;
	}

	public void setTxtDateOutput(String txtDateOutput) {
		this.txtDateOutput = convert.txtDMYHH(this.dateOutput);
	}

	public long getInvoiceDetailId() {
		return invoiceDetailId;
	}

	public void setInvoiceDetailId(long invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public WareHouseDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, long id,
			long productId, long itemTypeId, Date dateInput, Date dateOutput, long invoiceDetailId) {
		super(createDate, modifyDate, userCreate, userModify, branchId);
		this.id = id;
		this.productId = productId;
		this.itemTypeId = itemTypeId;
		this.dateInput = dateInput;
		this.dateOutput = dateOutput;
		this.invoiceDetailId = invoiceDetailId;
	}

	public WareHouseDTO() {
		convert = new Converter();
	}
}
