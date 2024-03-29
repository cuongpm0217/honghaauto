package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gen_id")
    private String genId;
    @Column(name = "tel1")
    private String tel1;
    @Column(name = "tel2")
    private String tel2;
    @Column(name = "add1")
    private String add1;
    @Column(name = "add2")
    private String add2;
    @Column(name = "dob")
    private Date DOB;
    @Column(name = "branch_id", unique = true)
    private long branchId;

    public Customer() {
    }

    public Customer(long id, String name, String genId, String tel1, String tel2, String add1, String add2, Date dOB,
                    long branchId) {
        super();
        this.id = id;
        this.name = name;
        this.genId = genId;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.add1 = add1;
        this.add2 = add2;
        DOB = dOB;
        this.branchId = branchId;
    }

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

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date dOB) {
        DOB = dOB;
    }

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }


}
