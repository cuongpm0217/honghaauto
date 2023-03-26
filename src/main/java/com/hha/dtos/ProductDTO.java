package com.hha.dtos;

import java.util.Date;

import com.hha.utils.Converter;

public class ProductDTO extends BaseDTO {

	private long Id;

	private String name;
	// product code
	private String genId;

	private long typeId;

	private long colorId;

	private long groupId;

	private long costIn;

	private long costOut;

	private long imageGroupId;

	private int guarantee;// by month

	private Date expiry;

	private long partnerId;
	private String txtExpiry;
	private Converter convert;

	public String getTxtExpiry() {
		txtExpiry = convert.txtddMMyyyy(this.expiry);
		return txtExpiry;
	}

	public void setTxtExpiry(String txtExpiry) {
		this.txtExpiry = convert.txtddMMyyyy(this.expiry);
	}
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public long getColorId() {
		return colorId;
	}

	public void setColorId(long colorId) {
		this.colorId = colorId;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getCostIn() {
		return costIn;
	}

	public void setCostIn(long costIn) {
		this.costIn = costIn;
	}

	public long getCostOut() {
		return costOut;
	}

	public void setCostOut(long costOut) {
		this.costOut = costOut;
	}

	public long getImageGroupId() {
		return imageGroupId;
	}

	public void setImageGroupId(long imageGroupId) {
		this.imageGroupId = imageGroupId;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public long getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(long partnerId) {
		this.partnerId = partnerId;
	}

	public ProductDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId, long id,
			String name, String genId, long typeId, long colorId, long groupId, long costIn, long costOut,
			long imageGroupId, int guarantee, Date expiry, long partnerId) {
		super(createDate, modifyDate, userCreate, userModify, branchId);
		Id = id;
		this.name = name;
		this.genId = genId;
		this.typeId = typeId;
		this.colorId = colorId;
		this.groupId = groupId;
		this.costIn = costIn;
		this.costOut = costOut;
		this.imageGroupId = imageGroupId;
		this.guarantee = guarantee;
		this.expiry = expiry;
		this.partnerId = partnerId;
	}

	public ProductDTO() {
		convert = new Converter();
	}
}
