package com.hha.dtos;

public class ModuleDTO extends BaseDTO {
    private long id;

    private String name;

    public ModuleDTO(long id, String name) {
        this.id = id;
        this.name = name;

    }

    public ModuleDTO() {

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


}
