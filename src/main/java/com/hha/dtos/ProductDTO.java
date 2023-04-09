package com.hha.dtos;

import com.hha.utils.Converter;

import java.util.Date;

public class ProductDTO extends BaseDTO {
    private long id;
    private String name;
    // product code
    private String genId;
    private long costIn;
    private long costOut;
    private int guarantee;// by month
    private Date expiry;
    private String txtExpiry;
    private Converter convert;

    public ProductDTO() {
        convert = new Converter();
    }

    public ProductDTO(long id, String name, String genId, long costIn, long costOut, int guarantee, Date expiry,
                      String txtExpiry, Converter convert) {
        super();
        this.id = id;
        this.name = name;
        this.genId = genId;
        this.costIn = costIn;
        this.costOut = costOut;
        this.guarantee = guarantee;
        this.expiry = expiry;
        this.txtExpiry = txtExpiry;
        this.convert = convert;
        convert = new Converter();
    }

    public String getTxtExpiry() {
        txtExpiry = convert.txtddMMyyyy(this.expiry);
        return txtExpiry;
    }

    public void setTxtExpiry(String txtExpiry) {
        this.txtExpiry = convert.txtddMMyyyy(this.expiry);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenId() {
        return genId;
    }

    public void setGenId(String genId) {
        this.genId = genId;
    }

    public long getCostIn() {
        return costIn;
    }

    public void setCostIn(long costIn) {
        this.costIn = costIn;
    }

    public long getCostOut() {
        return costOut;
    }

    public void setCostOut(long costOut) {
        this.costOut = costOut;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

}
