package jpa.app.services;

import jakarta.persistence.EntityManager;
import jpa.app.config.Module2EntityManager;
import jpa.app.entities.Country;

public class RelOnetoOneService {



    public static void main(String[] args) {

        EntityManager entityManager = Module2EntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();

    /*    Country country= new Country();
        country.setName("myCountry");

        // set cascade to persist
      //  entityManager.persist(country);

        State state = new State();
        state.setName("state1");
        state.setCountry(country);
        entityManager.persist(state);
*/
        Country country = entityManager.find(Country.class, 13);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
