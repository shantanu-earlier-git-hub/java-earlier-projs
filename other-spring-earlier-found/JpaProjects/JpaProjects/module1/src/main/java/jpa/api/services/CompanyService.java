package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Company;
import jpa.api.entities.embed.Branch;

public class CompanyService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();

        Branch branch = new Branch();
        branch.setAddr("address");
        branch.setCity("city");
        branch.setPinCode(1234);

        Company company = new Company();

        company.setName("name1");
        company.setBranch(branch);

        entityManager.persist(company);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
