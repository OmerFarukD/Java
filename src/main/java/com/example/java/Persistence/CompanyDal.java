package com.example.java.Persistence;

import com.example.java.Entites.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDal extends JpaRepository<Company,Integer> {

}
