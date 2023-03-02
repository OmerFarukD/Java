package com.example.java.Controller;

import com.example.java.Business.abstracts.ICompanyService;
import com.example.java.Dtos.CompanyAddDto;
import com.example.java.Entites.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/companies/")
@RequiredArgsConstructor
public class CompaniesController {
    private final ICompanyService companyService;

    @GetMapping("getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.getAll());
    }
    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody CompanyAddDto companyAddDto){
        this.companyService.add(companyAddDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Firma eklendi.");
    }

    @PatchMapping("update")
    public ResponseEntity<?> update(@RequestBody Company company){
        this.companyService.Update(company);
        return ResponseEntity.status(HttpStatus.OK).body("Firma güncellendi.");
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestParam int id){
        this.companyService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Firma silindi.");
    }

}
