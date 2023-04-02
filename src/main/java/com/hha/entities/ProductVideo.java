package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductVideo extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="product_id",nullable=false)
	private long productId;
	@Column(name="video_id",nullable=false)
	private long videoId;
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
	public long getVideoId() {
		return videoId;
	}
	public void setVideoId(long videoId) {
		this.videoId = videoId;
	}
	public ProductVideo(Date createDate, Date modifyDate, long userCreate, long userModify, long branchId,
			boolean isEnable, long id, long productId, long videoId) {
		super(createDate, modifyDate, userCreate, userModify, branchId, isEnable);
		this.id = id;
		this.productId = productId;
		this.videoId = videoId;
	}
	public ProductVideo(long id, long productId, long videoId) {
	
		this.id = id;
		this.productId = productId;
		this.videoId = videoId;
	}
	public ProductVideo() {
	
	}
	
}
