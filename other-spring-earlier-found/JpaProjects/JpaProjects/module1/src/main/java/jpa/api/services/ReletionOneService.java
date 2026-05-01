package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.People;

public class ReletionOneService {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");


        entityManager.getTransaction().begin();

        People people = new People();

        people.setName("people 1");
        people.setStreet("street");
        people.setCity("shinty");
        people.setHeight(127);
        people.setColor("red");

        entityManager.persist(people);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
