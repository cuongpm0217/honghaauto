package com.hha.dtos;

public class ProductImageDTO extends BaseDTO {
    private long id;
    private long productId;
    private long imageId;

    public ProductImageDTO(long id, long productId, long imageId) {
        this.id = id;
        this.productId = productId;
        this.imageId = imageId;
    }

    public ProductImageDTO() {

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
