package com.hha.dtos;

import java.util.Date;

public class ProductColorDTO extends BaseDTO{
	private long id;
	private long productId;
	private long colorId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getColorId() {
		return colorId;
	}
	public void setColorId(long colorId) {
		this.colorId = colorId;
	}
	
	public ProductColorDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, long productId, long colorId) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.productId = productId;
		this.colorId = colorId;
	}
	public ProductColorDTO(long id, long productId, long colorId) {
		
		this.id = id;
		this.productId = productId;
		this.colorId = colorId;
	}
	public ProductColorDTO() {
		
	}
	
}
