package com.hha.dtos;

import com.hha.utils.Converter;

import java.util.Date;

public class CustomerDTO extends BaseDTO {

    private long id;

    private String name;

    private String genId;

    private String tel1;

    private String tel2;
    private String add1;
    private String add2;

    private Date DOB;
    private String txtDOB;
    private long branchId;
    private Converter convert;

    public CustomerDTO(long id, String name, String genId, String tel1, String tel2, String add1, String add2, Date dOB,
                       String txtDOB, long branchId) {
        super();
        this.id = id;
        this.name = name;
        this.genId = genId;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.add1 = add1;
        this.add2 = add2;
        DOB = dOB;
        this.txtDOB = txtDOB;
        this.branchId = branchId;
        convert = new Converter();
    }

    public CustomerDTO() {
        convert = new Converter();
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

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date dOB) {
        DOB = dOB;
    }

    public String getTxtDOB() {
        txtDOB = convert.txtddMMyyyy(this.DOB);
        return txtDOB;
    }

    public void setTxtDOB(String txtDOB) {
        this.txtDOB = convert.txtddMMyyyy(this.DOB);
    }

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

}
