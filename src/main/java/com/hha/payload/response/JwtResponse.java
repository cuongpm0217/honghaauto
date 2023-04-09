package com.hha.payload.response;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type;
    private Long id;
    private String userName;
    private String passWord;
    private List<String> roles;

    public JwtResponse(String accesstoken, Long id, String userName, String passWord, List<String> roles) {
        this.token = accesstoken;
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
