package simple_services;

import config.AppEntityManager;
import simple_entities.Person;

public class PersonOnetoOneSingleEntityService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");

        Person p1 = new Person();
        p1.setName("person Name");

        p1.setEmail("person@email.com");
        p1.setPhone("784438478");
        p1.setDetails("some details for misc");

        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
