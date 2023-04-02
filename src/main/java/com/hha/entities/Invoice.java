package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class Invoice extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	@Column(nullable = false, name = "cus_id")
	private long cusId;
	@Column(nullable = false, name = "emp_id")
	private long empId;
	@Column
	private String tittle;
	@Column
	private long total;
	@Column(name = "started_date")
	private Date startedDate;
	@Column(name = "end_Date")
	private Date endDate;
	@Column(name = "logo_url")
	private String logoUrl;
	@Column(name = "tel_branch")
	private String telBranch;
	@Column(name = "add_branch")
	private String addBranch;
	@Column(name = "bank_acc1")
	private String bankAcc1;
	@Column(name = "bank_acc2")
	private String bankAcc2;
	@Column(name = "currency_id")
	private long currencyId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(long currencyId) {
		this.currencyId = currencyId;
	}

	public Invoice() {
	}

	public Invoice(long id, long cusId, long empId, String tittle, long total, Date startedDate,
			Date endDate, String logoUrl, String telBranch, String addBranch, String bankAcc1, String bankAcc2,
			long currencyId) {
		super();
		this.id = id;		
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
	}

}
