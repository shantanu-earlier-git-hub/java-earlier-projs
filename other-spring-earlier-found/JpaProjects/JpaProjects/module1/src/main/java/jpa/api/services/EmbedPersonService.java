package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Person;
import jpa.api.entities.embed.Address;

public class EmbedPersonService {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();

        Person person = new Person();
        Address address = new Address();

        address.setAddress("some address");
        address.setCity("some city");
        address.setZip(12345);

        person.setFirst("first");
        person.setAddress(address);

        entityManager.persist(person);
        entityManager.getTransaction().commit();
        entityManager.close();



    }
}
