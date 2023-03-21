package com.hha.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Invoice extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,name="type_id")
	private long typeId;
	@Column(nullable=false,name="cus_id")
	private long cusId;
	@Column(nullable=false,name="emp_id")
	private long empId;
	@Column
	private String tittle;
	@Column
	private long total;
	@Column(name="started_date")
	private Date startedDate;
	@Column(name="end_Date")
	private Date endDate;
	@Column(name ="logo_url")
	private String logoUrl;
	@Column(name="tel_branch")
	private String telBranch;
	@Column(name="add_branch")
	private String addBranch;
	@Column(name="bank_acc1")
	private String bankAcc1;
	@Column(name="bank_acc2")
	private String bankAcc2;		
}
