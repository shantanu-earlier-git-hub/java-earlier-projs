package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.JPACategory;

public class JpaTable {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        JPACategory category = new JPACategory();
        category.setType("category_type");

        entityManager.getTransaction().begin();

        entityManager.persist(category);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
