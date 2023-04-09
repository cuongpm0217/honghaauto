package com.hha.entities;

import javax.persistence.*;

@Entity
public class Department extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "dep_name")
    private String depName;
    @Column(name = "dep_gen_id")
    private String depGenId;

    public Department() {
    }

    public Department(long id, String depName, String depGenId) {
        this.id = id;
        this.depName = depName;
        this.depGenId = depGenId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepGenId() {
        return depGenId;
    }

    public void setDepGenId(String depGenId) {
        this.depGenId = depGenId;
    }

}
