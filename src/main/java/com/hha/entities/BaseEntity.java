package com.hha.entities;

import java.util.Date;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class BaseEntity {
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modify_date")
	private Date modifyDate;
	@Column(name = "user_create")
	private long userCreate;
	@Column(name = "user_modify")
	private long userModify;
	@Column(name = "branch_id")
	private long branchId;
}
