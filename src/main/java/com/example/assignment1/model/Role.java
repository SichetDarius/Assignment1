package com.example.assignment1.model;

import javax.persistence.*;
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_role;
    @Column(name = "name",nullable = false,length = 20)
    private String name;

    public Role(Long id_role, String name) {
        this.id_role = id_role;
        this.name = name;
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(){}

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
