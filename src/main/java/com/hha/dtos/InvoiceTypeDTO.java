package com.hha.dtos;

public class InvoiceTypeDTO extends BaseDTO {
    private long id;
    private long invoiceId;
    private long typeId;

    public InvoiceTypeDTO() {
    }

    public InvoiceTypeDTO(long id, long invoiceId, long typeId) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.typeId = typeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }


}
