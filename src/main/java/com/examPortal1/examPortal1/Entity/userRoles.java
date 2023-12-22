package com.examPortal1.examPortal1.Entity;

import jakarta.persistence.*;

@Entity
public class userRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Roles roles;

    public userRoles() {
    }

    public userRoles(Long userRoleId, User user, Roles roles) {
        this.userRoleId = userRoleId;
        this.user = user;
        this.roles = roles;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRole() {
        return roles;
    }

    public void setRole(Roles roles) {
        this.roles = roles;
    }
}
