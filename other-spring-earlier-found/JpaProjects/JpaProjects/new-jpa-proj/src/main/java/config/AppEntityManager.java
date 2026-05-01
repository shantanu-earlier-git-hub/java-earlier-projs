package config;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class AppEntityManager {

    public static EntityManager getEntityManager(String persistenceUnit) {
        return Persistence.createEntityManagerFactory(persistenceUnit).createEntityManager();
    }


}
