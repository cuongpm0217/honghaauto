package com.hha.entities;

import javax.persistence.*;

@Entity
public class ModuleDetail extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column(name = "module_id", nullable = false)
    private long moduleId;

    public ModuleDetail(long id, String name, long moduleId) {
        this.id = id;
        this.name = name;
        this.moduleId = moduleId;
    }

    public ModuleDetail() {

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

    public long getModuleId() {
        return moduleId;
    }

    public void setModuleId(long moduleId) {
        this.moduleId = moduleId;
    }
}
