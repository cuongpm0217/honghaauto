package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gen_id") // product code
    private String genId;
    @Column(name = "cost_in")
    private long costIn;
    @Column(name = "cost_out")
    private long costOut;
    @Column(name = "guarantee")
    private int guarantee;// by month
    @Column(name = "expiry")
    private Date expiry;

    public Product() {
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

    public long getCostIn() {
        return costIn;
    }

    public void setCostIn(long costIn) {
        this.costIn = costIn;
    }

    public long getCostOut() {
        return costOut;
    }

    public void setCostOut(long costOut) {
        this.costOut = costOut;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
