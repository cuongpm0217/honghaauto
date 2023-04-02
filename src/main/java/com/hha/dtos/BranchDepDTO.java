package com.hha.dtos;

public class BranchDepDTO extends BaseDTO{
	private long id;
	private long branchId;
	private long depId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public long getDepId() {
		return depId;
	}
	public void setDepId(long depId) {
		this.depId = depId;
	}
	public BranchDepDTO(long id, long branchId, long depId) {
		
		this.id = id;
		this.branchId = branchId;
		this.depId = depId;
	}
	public BranchDepDTO() {
		
	}
	
}
