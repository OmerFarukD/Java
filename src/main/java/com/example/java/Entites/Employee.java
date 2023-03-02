package com.example.java.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Employees")
@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @ManyToOne()
    @JoinColumn(name = "company_id")
    @JsonBackReference
    private Company company;
}
