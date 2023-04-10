package com.hha.dtos;

public class CombinationDTO extends BaseDTO {
    private long id;
    private String genId;
    private String name;

    public CombinationDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CombinationDTO() {

    }

    public CombinationDTO(long id, String genId, String name) {
        super();
        this.id = id;
        this.genId = genId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
