package simple_services;

import config.AppEntityManager;
import simple_entities.Product;

import java.time.LocalDate;

public class ProductService {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");


        Product p1 = new Product(null, "beer", 400.23, LocalDate.now());
        Product p2 = new Product(null, "pens", 456.12, LocalDate.now());

        entityManager.getTransaction().begin();

        entityManager.persist(p1);
        entityManager.persist(p2);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
