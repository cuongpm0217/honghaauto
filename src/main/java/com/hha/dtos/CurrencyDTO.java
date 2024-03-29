package com.hha.dtos;

public class CurrencyDTO extends BaseDTO {
    private long id;

    private String code;// exp:VND ...

    private String name;// Vietnam Dong
    private double rate;

    public CurrencyDTO() {
    }

    public CurrencyDTO(long id, String code, String name, double rate) {

        this.id = id;
        this.code = code;
        this.name = name;
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
