package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Department;

public class DepartmentPriService {

    public static void main(String[] args) {


        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");
        entityManager.getTransaction().begin();

        Department department= new Department();
        department.setNumber(100);
        department.setCode("XYZ");
        department.setName("my-dept");

        entityManager.persist(department);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
