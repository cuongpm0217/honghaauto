package com.hha.entities;

import javax.persistence.*;

@Entity
public class BranchDep extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "branch_id", unique = true)
    private long branchId;
    @Column(name = "dep_id", unique = true)
    private long depId;

    public BranchDep(long id, long branchId, long depId) {
        this.id = id;
        this.branchId = branchId;
        this.depId = depId;
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

    public long getDepId() {
        return depId;
    }

    public void setDepId(long depId) {
        this.depId = depId;
    }

}
