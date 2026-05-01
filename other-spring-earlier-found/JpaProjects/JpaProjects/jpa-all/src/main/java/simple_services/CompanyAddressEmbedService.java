package simple_services;

import config.AppEntityManager;
import simple_entities.Company;
import simple_entities.embedded.Address;

public class CompanyAddressEmbedService {


    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");
        Company company = new Company();
        company.setName("some name of company");

        Address address = new Address();
        entityManager.getTransaction().begin();
        address.setAddressCity("somecity");
        address.setAddressState("somestate");

        company.setAddress(address);

        entityManager.persist(company);

        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
