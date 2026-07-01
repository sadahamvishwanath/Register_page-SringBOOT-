package com.sadaham.registerapp.model;

import jakarta.persistence.*;   // ← jakarta NOT javax

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    // Constructors
    public User() {}

    public User(String name, String email, String password) {
        this.name     = name;
        this.email    = email;
        this.password = password;
    }

    // Getters
    public Long getId()         { return id; }
    public String getName()     { return name; }
    public String getEmail()    { return email; }
    public String getPassword() { return password; }

    // Setters
    public void setId(Long id)            { this.id = id; }
    public void setName(String name)      { this.name = name; }
    public void setEmail(String email)    { this.email = email; }
    public void setPassword(String pass)  { this.password = pass; }
}