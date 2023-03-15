package com.example.assignment1.model;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    @Column(name="nume",nullable = false,length=20)
    private String nume;
    @Column(name="prenume",nullable = false,length=20)
    private String prenume;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(name = "username", nullable = false, unique = true, length = 20)
    private String username;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(name = "role", length = 20)
    private String role;

    public User(String nume, String prenume, String email, String username, String password, String role) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(Long id_user, String nume, String prenume, String email, String username, String password, String role) {
        this.id_user = id_user;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User()
    {

    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
