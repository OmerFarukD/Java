package com.example.java.Business.concrete;

import com.example.java.Business.abstracts.IEmployeeService;
import com.example.java.Dtos.EmployeeAddDto;
import com.example.java.Entites.Company;
import com.example.java.Entites.Employee;
import com.example.java.Persistence.EmployeeDal;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeManager implements IEmployeeService {

    private final EmployeeDal employeeDal;
    private final ModelMapper modelMapper;

    @Override
    public void add(EmployeeAddDto employeeAddDto) {
        Employee employee= this.modelMapper.map(employeeAddDto,Employee.class);

        this.employeeDal.save(employee);
    }

    @Override
    public void delete(int id) {

        this.employeeDal.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeDal.findAll();
    }

    @Override
    public void Update(Employee employee) {
        this.employeeDal.save(employee);
    }

}
