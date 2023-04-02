package com.hha.dtos;

import java.util.Date;

public class ProductImageDTO extends BaseDTO {
	private long id;
	private long productId;
	private long imageId;

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

	public long getImageId() {
		return imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	public ProductImageDTO(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, long productId, long imageId) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.productId = productId;
		this.imageId = imageId;
	}

	public ProductImageDTO(long id, long productId, long imageId) {
		this.id = id;
		this.productId = productId;
		this.imageId = imageId;
	}

	public ProductImageDTO() {

	}

}
