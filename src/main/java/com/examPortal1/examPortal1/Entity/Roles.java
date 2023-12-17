package com.examPortal1.examPortal1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Roles {
    @Id
    private Long roleId;
    private String roleName;

    public Roles(){}

    public Roles(Long roleId,String roleName){
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
