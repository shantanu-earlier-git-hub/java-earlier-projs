package app.services;

import app.config.AppEntityManager;
import app.entities.Person;

import javax.persistence.TypedQuery;
import java.util.List;

public class JpqlService {

    public static void main(String[] args) {

        var em= AppEntityManager.getEntityManager("mysql-jpa");


        em.getTransaction().begin();

        String query = "select p from Person p where p.id >= :num";
        TypedQuery<Person> typedQuery =  em.createQuery(query, Person.class);
        typedQuery.setParameter("num", 1);

        List<Person> personList= typedQuery.getResultList();

        personList.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();

    }
}
