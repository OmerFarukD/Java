package com.example.java.Business.abstracts;

import com.example.java.Dtos.CompanyAddDto;
import com.example.java.Entites.Company;

import java.util.List;

public interface ICompanyService {
    void add(CompanyAddDto companyAddDto);
    void delete(int id);
    List<Company> getAll();

    void Update(Company company);
}
