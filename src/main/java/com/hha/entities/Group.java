package com.hha.entities;

import javax.persistence.*;

@Entity
public class Group extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "gen_id")
    private String genId;
    @Column
    private String name;

    public Group() {

    }

    public Group(long id, String genId, String name) {
        super();
        this.id = id;
        this.genId = genId;
        this.name = name;
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

}
