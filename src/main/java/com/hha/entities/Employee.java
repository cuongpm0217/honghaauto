package com.hha.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Employee extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "emp_name")
	private String empName;
	@Column(name="emp_gen_id")
	private String empGenId;
	@Column(name = "emp_nation_id")
	private String empNationId;
	@Column(name="emp_tel1")
	private String empTel1;
	@Column(name ="emp_tel2")
	private String empTel2;
	@Column(name = "emp_dob")
	private Date empDOB;
	@Column(name = "emp_add1")
	private String empAdd1;
	@Column(name ="emp_add2")
	private String empAdd2;
	@Column(name = "emp_Salary")
	private long empSalary;
	@Column(name ="emp_Position")
	private String empPosition;
	@Column(name="emp_lever")
	private int empLever;//0-9 des
	@Column(name="user_id")
	private long userId;
	@Column(name="dep_id")
	private long depId;
	
}
