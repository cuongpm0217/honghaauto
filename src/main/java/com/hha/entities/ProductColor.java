package com.hha.entities;

import javax.persistence.*;

@Entity
public class ProductColor extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "color_id", nullable = false)
    private long color_id;
    @Column(name = "product_id", nullable = false)
    private long productId;

    public ProductColor(long id, long color_id, long productId) {
        this.id = id;
        this.color_id = color_id;
        this.productId = productId;
    }

    public ProductColor() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getColor_id() {
        return color_id;
    }

    public void setColor_id(long color_id) {
        this.color_id = color_id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

}
