package com.hha.entities;

import javax.persistence.*;

@Entity
public class Partner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String tel1;
    @Column
    private String tel2;
    @Column
    private String add1;
    @Column
    private String add2;
    @Column(name = "bank_acc1")
    private String bankAcc1;
    @Column(name = "bank_acc2")
    private String bankAcc2;

    public Partner() {
    }

    public Partner(long id, String name, String tel1, String tel2, String add1, String add2, String bankAcc1,
                   String bankAcc2) {
        super();
        this.id = id;
        this.name = name;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.add1 = add1;
        this.add2 = add2;
        this.bankAcc1 = bankAcc1;
        this.bankAcc2 = bankAcc2;
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

}
