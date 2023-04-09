package com.hha.entities;

import javax.persistence.*;

@Entity
public class InvoiceType extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "invoice_id", nullable = false)
    private long invoiceId;
    @Column(name = "type_id", nullable = false)
    private long typeId;

    public InvoiceType(long id, long invoiceId, long typeId) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.typeId = typeId;
    }

    public InvoiceType() {

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
