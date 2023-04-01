package com.hha.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "gen_id") // product code
	private String genId;
	@Column(name = "type_id")
	private long typeId;
	@Column(name = "color_id")
	private long colorId;
	@Column(name = "group_id")
	private long groupId;
	@Column(name = "cost_in")
	private long costIn;
	@Column(name = "cost_out")
	private long costOut;
	@Column(name = "image_group_id")
	private long imageGroupId;
	@Column(name = "guarantee")
	private int guarantee;// by month
	@Column(name = "expiry")
	private Date expiry;
	@Column(name = "partner_id")
	private long partnerId;

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

	public Product(long id, String name, String genId, long typeId, long colorId, long groupId, long costIn,
			long costOut, long imageGroupId, int guarantee, Date expiry, long partnerId) {
		super();
		this.id = id;
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

	public Product() {
	}
}
