package com.hha.dtos;

import com.hha.utils.Converter;

import java.util.Date;

public class InvoiceDTO extends BaseDTO {
	private long id;
	private long typeId;
	private long cusId;
	private long empId;
	private String tittle;
	private long total;
	private Date startedDate;
	private Date endDate;
	private String logoUrl;
	private String telBranch;
	private String addBranch;
	private String bankAcc1;
	private String bankAcc2;
	private String currencyId;	
	private long branchId;	
	
	private String txtStartedDate;
	private String txtEndDate;	
	private Converter convert;

	public String getTxtStartedDate() {
		txtStartedDate = convert.txtDMYHH(this.startedDate);
		return txtStartedDate;
	}

	public void setTxtStartedDate(String txtStartedDate) {
		this.txtStartedDate = convert.txtDMYHH(this.startedDate);
	}

	public String getTxtEndDate() {
		txtEndDate = convert.txtDMYHH(this.endDate);
		return txtEndDate;
	}

	public void setTxtEndDate(String txtEndDate) {
		this.txtEndDate = convert.txtDMYHH(this.endDate);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public long getCusId() {
		return cusId;
	}

	public void setCusId(long cusId) {
		this.cusId = cusId;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getTelBranch() {
		return telBranch;
	}

	public void setTelBranch(String telBranch) {
		this.telBranch = telBranch;
	}

	public String getAddBranch() {
		return addBranch;
	}

	public void setAddBranch(String addBranch) {
		this.addBranch = addBranch;
	}

	public String getBankAcc1() {
		return bankAcc1;
	}

	public void setBankAcc1(String bankAcc1) {
		this.bankAcc1 = bankAcc1;
	}

	public String getBankAcc2() {
		return bankAcc2;
	}

	public void setBankAcc2(String bankAcc2) {
		this.bankAcc2 = bankAcc2;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public InvoiceDTO() {
		convert = new Converter();
	}

	public InvoiceDTO(long id, long typeId, long cusId, long empId, String tittle, long total, Date startedDate,
			Date endDate, String logoUrl, String telBranch, String addBranch, String bankAcc1, String bankAcc2,
			String currencyId, long branchId, String txtStartedDate, String txtEndDate) {
		super();
		this.id = id;
		this.typeId = typeId;
		this.cusId = cusId;
		this.empId = empId;
		this.tittle = tittle;
		this.total = total;
		this.startedDate = startedDate;
		this.endDate = endDate;
		this.logoUrl = logoUrl;
		this.telBranch = telBranch;
		this.addBranch = addBranch;
		this.bankAcc1 = bankAcc1;
		this.bankAcc2 = bankAcc2;
		this.currencyId = currencyId;
		this.branchId = branchId;
		this.txtStartedDate = txtStartedDate;
		this.txtEndDate = txtEndDate;
		convert = new Converter();
	}

}
