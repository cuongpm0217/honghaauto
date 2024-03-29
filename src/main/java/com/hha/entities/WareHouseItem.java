package com.hha.entities;

import javax.persistence.*;

@Entity

public class WareHouseItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private EWareHouseItem name;// Fixed assets,accessary ,equipment

    public WareHouseItem(long id, EWareHouseItem name) {
        this.id = id;
        this.name = name;
    }

    public WareHouseItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EWareHouseItem getName() {
        return name;
    }

    public void setName(EWareHouseItem name) {
        this.name = name;
    }
}
