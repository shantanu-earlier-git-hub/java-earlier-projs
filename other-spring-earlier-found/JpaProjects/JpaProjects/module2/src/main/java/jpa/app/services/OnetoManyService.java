package jpa.app.services;

import jakarta.persistence.EntityManager;
import jpa.app.config.Module2EntityManager;
import jpa.app.entities.Dept;
import jpa.app.entities.Employee;

import java.util.ArrayList;

public class OnetoManyService {

    public static void main(String[] args) {

        EntityManager entityManager = Module2EntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();

        Employee emp = new Employee();
        emp.setName("emp1");

        entityManager.persist(emp);

        Dept dept= new Dept();

        dept.setName("dept1");
        dept.setEmployee(new ArrayList<>());
        dept.getEmployee().add(emp);


        entityManager.persist(dept);


        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
