package com.hha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "gen_id")
	private String genId;
	@Column(name = "nation_id")
	private String nationId;
	@Column(name = "tel1")
	private String tel1;
	@Column(name = "tel2")
	private String tel2;
	@Column(name = "dob")
	private Date DOB;
	@Column(name = "add1")
	private String add1;
	@Column(name = "add2")
	private String add2;
	@Column(name = "salary")
	private long salary;
	@Column(name = "bank_acc1")
	private String bankAcc1;
	@Column(name = "bank_acc2")
	private String bankAcc2;
	@Column(name = "position")
	private String position;
	@Column(name = "lever")
	private int lever;// 0-9 des
	@Column(name = "user_id")
	private long userId;
	@Column(name = "dep_id",unique=true)
	private long depId;
	@Column(name="branch_id",unique=true)
	private long branchId;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenId() {
		return genId;
	}

	public void setGenId(String genId) {
		this.genId = genId;
	}

	public String getNationId() {
		return nationId;
	}

	public void setNationId(String nationId) {
		this.nationId = nationId;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getLever() {
		return lever;
	}

	public void setLever(int lever) {
		this.lever = lever;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getDepId() {
		return depId;
	}

	public void setDepId(long depId) {
		this.depId = depId;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public Employee() {
	}

	public Employee(long id, String name, String genId, String nationId, String tel1, String tel2, Date dOB,
			String add1, String add2, long salary, String bankAcc1, String bankAcc2, String position, int lever,
			long userId, long depId, long branchId) {
		super();
		this.id = id;
		this.name = name;
		this.genId = genId;
		this.nationId = nationId;
		this.tel1 = tel1;
		this.tel2 = tel2;
		DOB = dOB;
		this.add1 = add1;
		this.add2 = add2;
		this.salary = salary;
		this.bankAcc1 = bankAcc1;
		this.bankAcc2 = bankAcc2;
		this.position = position;
		this.lever = lever;
		this.userId = userId;
		this.depId = depId;
		this.branchId = branchId;
	}

	
}
