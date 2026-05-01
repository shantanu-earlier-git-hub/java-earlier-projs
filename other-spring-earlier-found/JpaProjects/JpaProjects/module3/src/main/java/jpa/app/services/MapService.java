package jpa.app.services;

import jpa.app.config.AppEntityManager;
import jpa.app.entities.Person;

import java.util.HashMap;

public class MapService {

    public static void main(String[] args) {

        var em = AppEntityManager.getEntityManager("mysql-jpa");


        Person person= new Person();
        person.setName("new name");

        person.setPhoneNumbers(new HashMap<>());

        person.getPhoneNumbers().put("cell","1234-cell");
        person.getPhoneNumbers().put("landline","3456-landline");

        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();

    }
}
