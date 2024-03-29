package com.hha.entities;

import javax.persistence.*;

@Entity
public class Videos extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String tittle;
    @Column
    private String desciption;
    @Column
    private String url;

    public Videos(long id, String tittle, String desciption, String url) {
        this.id = id;
        this.tittle = tittle;
        this.desciption = desciption;
        this.url = url;
    }

    public Videos() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
