package com.hha.entities;

import javax.persistence.*;

@Entity
public class ProductImage extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_id", nullable = false)
    private long productId;
    @Column(name = "image_id", nullable = false)
    private long imageId;

    public ProductImage(long id, long productId, long imageId) {
        this.id = id;
        this.productId = productId;
        this.imageId = imageId;
    }

    public ProductImage() {

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

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

}
