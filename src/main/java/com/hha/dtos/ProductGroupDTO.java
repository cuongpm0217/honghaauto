package com.hha.dtos;

public class ProductGroupDTO extends BaseDTO {
    private long id;
    private String genId;// code
    private long productId;
    private long groupId;

    public ProductGroupDTO() {
    }

    public ProductGroupDTO(long id, String genId, long productId, long groupId) {
        super();
        this.id = id;
        this.genId = genId;
        this.productId = productId;
        this.groupId = groupId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


}
