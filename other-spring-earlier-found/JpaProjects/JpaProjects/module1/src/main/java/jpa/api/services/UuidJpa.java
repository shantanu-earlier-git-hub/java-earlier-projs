package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Event;

public class UuidJpa {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        Event event = new Event();
        event.setName("name1");
        entityManager.getTransaction().begin();

        entityManager.persist(event);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
