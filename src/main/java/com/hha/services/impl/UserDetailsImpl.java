package com.hha.services.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hha.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 616317309785761804L;
    private Long id;
    private String userName;
    private String email;
    @JsonIgnore
    private String passWord;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(Long id, String userName, String email, String passWord,
                           Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.authorities = authorities;
    }
//
    public static UserDetails build(User user,List<String> authorList) {    	 	
        List<GrantedAuthority> authorities = authorList.stream()
                .map(keyValue2String -> new SimpleGrantedAuthority(keyValue2String)).collect(Collectors.toList());
        return new UserDetailsImpl(user.getId(), user.getUserName(), user.getEmail(), user.getPassWord(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.getPassword();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
