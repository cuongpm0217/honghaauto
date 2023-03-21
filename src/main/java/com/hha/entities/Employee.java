package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Employee extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name="gen_id")
	private String genId;
	@Column(name = "nation_id")
	private String nationId;
	@Column(name="tel1")
	private String tel1;
	@Column(name ="tel2")
	private String tel2;
	@Column(name = "dob")
	private Date DOB;
	@Column(name = "add1")
	private String add1;
	@Column(name ="add2")
	private String add2;
	@Column(name = "salary")
	private long salary;
	@Column(name="bank_acc1")
	private String bankAcc1;
	@Column(name="bank_acc2")
	private String bankAcc2;
	@Column(name ="position")
	private String position;
	@Column(name="lever")
	private int lever;//0-9 des
	@Column(name="user_id")
	private long userId;
	@Column(name="dep_id")
	private long depId;
	
}
