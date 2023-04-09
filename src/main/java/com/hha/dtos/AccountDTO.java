package com.hha.dtos;

public class AccountDTO extends BaseDTO {

    private long id;

    private String code;

    private String name;

    private int lever;// 0-2:sub-account, account example: 131,1311

    public AccountDTO(long id, String code, String name, int lever) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.lever = lever;
    }

    public AccountDTO() {
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

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }
}
