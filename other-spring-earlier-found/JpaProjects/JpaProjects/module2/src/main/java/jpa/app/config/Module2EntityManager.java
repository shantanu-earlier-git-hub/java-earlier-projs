package jpa.app.config;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Module2EntityManager {

    public static EntityManager getEntityManager(String persistenceUnit) {
        EntityManagerFactory entityManagerFactory;
        EntityManager entityManager;
        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
