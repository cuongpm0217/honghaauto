package com.hha.dtos;

public class ProductPartnerDTO extends BaseDTO {
    private long id;
    private long productId;
    private long partnerId;

    public ProductPartnerDTO(long id, long productId, long partnerId) {
        this.id = id;
        this.productId = productId;
        this.partnerId = partnerId;
    }

    public ProductPartnerDTO() {

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
