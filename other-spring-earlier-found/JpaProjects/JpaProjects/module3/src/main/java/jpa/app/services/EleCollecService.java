package jpa.app.services;

import jpa.app.config.AppEntityManager;
import jpa.app.entities.Person;

import java.util.ArrayList;

public class EleCollecService {

    public static void main(String[] args) {

        var em= AppEntityManager.getEntityManager("mysql-jpa");
        Person person= new Person();
        person.setName("name1");

       // person.setPhoneNumbers(new ArrayList<>());
       // person.getPhoneNumbers().add("123");

        em.getTransaction().begin();
        em.persist(person);

        em.getTransaction().commit();
        em.close();
    }
}
