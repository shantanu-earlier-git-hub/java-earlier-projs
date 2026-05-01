package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Product;

import java.time.LocalDate;

public class JpaMain {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        Product product[] = new Product[2];
        product[0] = new Product(100, "beer" , 100.00d, LocalDate.now());
        product[1] = new Product(200, "wine" , 120.00d, LocalDate.now());

        entityManager.getTransaction().begin();

        entityManager.persist(product[0]);
        entityManager.persist(product[1]);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
