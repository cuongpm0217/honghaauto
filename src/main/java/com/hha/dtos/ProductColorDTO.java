package com.hha.dtos;

public class ProductColorDTO extends BaseDTO {
    private long id;
    private long productId;
    private long colorId;

    public ProductColorDTO(long id, long productId, long colorId) {
        this.id = id;
        this.productId = productId;
        this.colorId = colorId;
    }

    public ProductColorDTO() {

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

    public long getColorId() {
        return colorId;
    }

    public void setColorId(long colorId) {
        this.colorId = colorId;
    }

}
