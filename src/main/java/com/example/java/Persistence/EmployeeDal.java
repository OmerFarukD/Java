package com.example.java.Persistence;

import com.example.java.Entites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDal extends JpaRepository<Employee,Integer> {
}
