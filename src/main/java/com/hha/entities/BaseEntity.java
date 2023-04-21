package com.hha.entities;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createDate;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date modifyDate;
    @CreatedBy
	protected String userCreate;
    @LastModifiedBy
    protected String userModify;
    @Column(name = "is_enable")
    protected boolean isEnable;

    public BaseEntity(Date createDate, Date modifyDate, String userCreate, String userModify,
                      boolean isEnable) {
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.userCreate = userCreate;
        this.userModify = userModify;
        this.isEnable = isEnable;
    }

    public BaseEntity() {

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


}
