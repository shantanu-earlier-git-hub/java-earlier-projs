package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Dept;
import jpa.api.entities.Product;
import jpa.api.entities.embed.DeptPK;

import java.time.LocalDate;

public class DeptEmbedPKService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();

        Dept dept= new Dept();
        DeptPK primary= new DeptPK();

        primary.setId(1000);
        primary.setCode("pqr");

        dept.setId(primary);
        dept.setName("justname");

        entityManager.persist(dept);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
