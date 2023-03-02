package com.example.java.Business.concrete;

import com.example.java.Business.abstracts.ICompanyService;
import com.example.java.Dtos.CompanyAddDto;
import com.example.java.Entites.Company;
import com.example.java.Persistence.CompanyDal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyManager implements ICompanyService {

    private final CompanyDal companyDal;
    @Override
    public void add(CompanyAddDto companyAddDto) {

        Company company=this.dtoConvertEntity(companyAddDto);
        this.companyDal.save(company);
    }

    @Override
    public void delete(int id) {
        this.companyDal.deleteById(id);
    }

    @Override
    public List<Company> getAll() {
        return this.companyDal.findAll();
    }

    @Override
    public void Update(Company company) {
        this.companyDal.save(company);
    }


    private Company dtoConvertEntity(CompanyAddDto companyAddDto){
        Company company= new Company();
        company.setCompanyName(companyAddDto.getName());
        return company;
    }
}
