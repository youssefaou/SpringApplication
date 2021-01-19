package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name  ="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "role_name", length = 50)
    private String RoleName;

    public Role() {
    }
    public Role(String roleName) {
        RoleName = roleName;
    }

    public int getId() {
        return id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }


}
