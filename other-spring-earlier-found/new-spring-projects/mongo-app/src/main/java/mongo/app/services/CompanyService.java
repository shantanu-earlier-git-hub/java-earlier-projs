package mongo.app.services;


import mongo.app.entity.company.Company;
import mongo.app.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return this.companyRepository.findAll();
    }

    public void insertOneCompany(Company company) {
         this.companyRepository.save(company);

    }

}
