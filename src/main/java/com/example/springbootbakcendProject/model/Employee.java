package com.example.springbootbakcendProject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
}
