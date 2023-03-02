package com.example.java.Entites;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "companies")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private int id;

    @Column(name = "companyName")
    private String companyName;


    @OneToMany(mappedBy = "company")
    @JsonManagedReference
    private List<Employee> employees;

}
