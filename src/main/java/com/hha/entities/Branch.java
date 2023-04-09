package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Branch extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "gen_Id")
    private String genId;
    @Column(name = "lever")
    private int lever;//	1-3 des
    @Column(name = "establish_date")
    private Date establishDate;

    public Branch() {

    }

    public Branch(long id, String name, String genId, int lever, Date establishDate) {
        super();
        this.id = id;
        this.name = name;
        this.genId = genId;
        this.lever = lever;
        this.establishDate = establishDate;
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

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }


}
