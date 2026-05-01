package app.services;

import app.config.AppEntityManager;
import app.jpa.Animal;
import app.jpa.Cat;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;

public class SimpleInheriService {

    /*
            entitymanger methods

            transaction begin , commit , rollback

            persist(), find() , getReference() , contains() , detach() , clear() , remove() , merge() , refresh()

            flush()
            close()

     */


    public static void main(String[] args) {

        var em = AppEntityManager.getEntityManager("mysql-jpa");

        Animal animal= new Animal();
        animal.setName("An");

        Cat cat= new Cat();
        cat.setName("C");
        cat.setColor("black");

        em.getTransaction().begin();
        em.persist(animal);
        em.persist(cat);

        em.getTransaction().commit();
        em.close();
    }
}
