package com.hha.dtos;

public class UserDTO extends BaseDTO {
    private long id;
    private String userName;
    private String passWord;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserDTO() {
    }

	public UserDTO(long id, String userName, String passWord) {
        super();
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

}
