package com.hha.entities;

import javax.persistence.*;

@Entity
public class ProductType extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column(name = "gen_id") // product type code
    private String genId;
    @Column(name = "product_id", nullable = false)
    private long productId;
    @Column(name = "type_id", nullable = false)
    private long typeId;

    public ProductType() {
    }

    public ProductType(long id, String name, String genId, long productId, long typeId) {
        this.id = id;
        this.name = name;
        this.genId = genId;
        this.productId = productId;
        this.typeId = typeId;
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

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

}
