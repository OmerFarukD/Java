package com.example.java.Controller;


import com.example.java.Business.abstracts.IEmployeeService;
import com.example.java.Dtos.EmployeeAddDto;
import com.example.java.Entites.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeesController {
    private final IEmployeeService employeeService;

    @GetMapping("getall")
    public ResponseEntity<?> getall(){
        return ResponseEntity.status(HttpStatus.OK).body(this.employeeService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody EmployeeAddDto employeeAddDto){
        this.employeeService.add(employeeAddDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Çalışan eklendi.");
    }

    @PatchMapping("update")
    public ResponseEntity<?> update(@RequestBody Employee employee){
        this.employeeService.Update(employee);
        return ResponseEntity.status(HttpStatus.OK).body("Çalışan güncellendi.");
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestParam int id){
        this.employeeService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Çalışan silindi.");
    }
}
