package com.hha.dtos;

public class BranchPartnerDTO extends BaseDTO {
    private long id;
    private long branchId;
    private long partnerId;

    public BranchPartnerDTO(long id, long branchId, long partnerId) {
        this.id = id;
        this.branchId = branchId;
        this.partnerId = partnerId;
    }

    public BranchPartnerDTO() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

}
