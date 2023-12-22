package com.examPortal1.examPortal1.Entity;
import java.util.*;

import jakarta.persistence.*;

import java.util.HashSet;

@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;
    private String roleName;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "roles")
    private Set<userRoles>userRoles = new HashSet<>();
    public Set<com.examPortal1.examPortal1.Entity.userRoles> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<com.examPortal1.examPortal1.Entity.userRoles> userRoles) {
        this.userRoles = userRoles;
    }



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
