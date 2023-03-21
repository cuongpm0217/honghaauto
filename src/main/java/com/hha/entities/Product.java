package com.hha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Product extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="name")
	private String name;
	@Column(name="gen_id")//product code
	private String genId;
	@Column(name="type_id")
	private long typeId;
	@Column(name="color_id")
	private long colorId;
	@Column(name="group_id")
	private long groupId;
	@Column(name="cost_in")
	private long costIn;
	@Column(name="cost_out")
	private long costOut;
	@Column(name="image_group_id")
	private long imageGroupId;
	@Column(name="guarantee")
	private int guarantee;//by month
	@Column(name="expiry")
	private Date expiry;
	@Column(name="partner_id")
	private long partnerId;
}
