package com.hha.entities;

import javax.persistence.*;

@Entity
public class ProductPartner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_id", nullable = false)
    private long productId;
    @Column(name = "partner_id", nullable = false)
    private long partnerId;

    public ProductPartner(long id, long productId, long partnerId) {
        this.id = id;
        this.productId = productId;
        this.partnerId = partnerId;
    }

    public ProductPartner() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

}
