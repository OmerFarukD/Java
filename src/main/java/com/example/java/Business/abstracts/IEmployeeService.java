package com.example.java.Business.abstracts;

import com.example.java.Dtos.EmployeeAddDto;
import com.example.java.Entites.Company;
import com.example.java.Entites.Employee;

import java.util.List;

public interface IEmployeeService {
    void add(EmployeeAddDto employeeAddDto);
    void delete(int id);
    List<Employee> getAll();

    void Update(Employee employee);
}
