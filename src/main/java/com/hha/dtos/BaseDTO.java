package com.hha.dtos;

import com.hha.utils.Converter;

import java.util.Date;

public abstract class BaseDTO {
    protected Date createDate;
    private Date modifyDate;
    private String userCreate;
    private String userModify;
    private String txtCreateDate;
    private String txtModifyDate;
    private Converter convert;
    private boolean isEnable;
  
   

    public BaseDTO(Date createDate, Date modifyDate, String userCreate, String userModify, String txtCreateDate,
			String txtModifyDate, boolean isEnable) {
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.userCreate = userCreate;
		this.userModify = userModify;
		this.txtCreateDate = txtCreateDate;
		this.txtModifyDate = txtModifyDate;
		this.isEnable = isEnable;		
		convert = new Converter();
	}

	public BaseDTO() {
        convert = new Converter();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getTxtCreateDate() {
        txtCreateDate = convert.txtDMYHH(this.createDate);
        return txtCreateDate;
    }

    public void setTxtCreateDate(Date createDate) {
        this.txtCreateDate = convert.txtDMYHH(createDate);
    }

    public String getTxtModifyDate() {
        txtModifyDate = convert.txtDMYHH(this.modifyDate);
        return txtModifyDate;
    }

    public void setTxtModifyDate(Date modifyDate) {
        this.txtModifyDate = convert.txtDMYHH(modifyDate);
    }

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public String getUserModify() {
        return userModify;
    }

    public void setUserModify(String userModify) {
        this.userModify = userModify;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

	public void setTxtCreateDate(String txtCreateDate) {
		this.txtCreateDate = txtCreateDate;
	}

	public void setTxtModifyDate(String txtModifyDate) {
		this.txtModifyDate = txtModifyDate;
	}
    
}
