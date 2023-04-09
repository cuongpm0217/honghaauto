package com.hha.entities;

import javax.persistence.*;

@Entity
public class BranchPartner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "branch_id", unique = true)
    private long branchId;
    @Column(name = "partner_id", unique = true)
    private long partnerId;

    public BranchPartner(long id, long branchId, long partnerId) {
        this.id = id;
        this.branchId = branchId;
        this.partnerId = partnerId;
    }

    public BranchPartner() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

}
