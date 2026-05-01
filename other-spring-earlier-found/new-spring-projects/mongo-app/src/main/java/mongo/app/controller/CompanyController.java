package mongo.app.controller;

import mongo.app.entity.company.Company;
import mongo.app.services.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/all")
    public List<Company> getAllCompanies(){

        return companyService.findAll();
    }

    @PostMapping("/create")
    public void createOneCompany(@RequestBody Company company){

        companyService.insertOneCompany(company);
    }


}
