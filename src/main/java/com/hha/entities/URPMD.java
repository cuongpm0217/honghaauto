package com.hha.entities;

import javax.persistence.*;

@Entity
public class URPMD extends BaseEntity {// user_role + permission + moduleDetail
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "permission_id")
    private long permissionId;
    @Column(name="branch_id")
    private long branchId;
    @Column(name = "moduleDetail_id")
    private long moduleDetailId;

    public URPMD() {

    }

    public URPMD(long id, long userId, long roleId, long permissionId, long branchId, long moduleDetailId) {
		super();
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.permissionId = permissionId;
		this.branchId = branchId;
		this.moduleDetailId = moduleDetailId;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public long getModuleDetailId() {
        return moduleDetailId;
    }

    public void setModuleDetailId(long moduleDetailId) {
        this.moduleDetailId = moduleDetailId;
    }

}
