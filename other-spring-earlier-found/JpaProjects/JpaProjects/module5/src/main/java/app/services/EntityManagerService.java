package app.services;

import app.config.AppEntityManager;
import app.entities.Person;

public class EntityManagerService {


     /*
            entitymanger methods

            transaction begin , commit , rollback

            // persists/add  into JPA context but doesn't commit to database.
            persist(),
            // it commits before the actual commit method calls , it helps if transaction dependency needed
            flush()

            find() ,

            // getReference() find the element in the database but lazy way , when try to print /fetch it
            // it makes call to database execute the find query.
            getReference() ,

            // with find entity
            contains() ,

            detach() ,
            clear() ,
            remove() ,

            merge() ,
            refresh()

            close()

     */

    public static void main(String[] args) {

        var em = AppEntityManager.getEntityManager("mysql-jpa");



        // persist and flush
        /*Person person= new Person();
        person.setId(10);
        person.setName("just name"+ person.getId());
        em.persist(person);
        *//*
            when flush is enabled then it has been persisted into database first. then printed :)
         *//*
        //em.flush();
        System.out.println(":)");
        */

        em.getTransaction().begin();

        // find and getReference
        //Person person = em.find(Person.class, 10);

        // lazy fetching when trying to print the person class otherwise no database call.
        /*
            Person person = em.getReference(Person.class, 10);
            System.out.println(":)" +person);
        */


        // find and contains
    /*
        Person person = em.find(Person.class, 10);
        System.out.println(em.contains(person)); // returns true if find the object in JPA CONTEXT.
    */

        /*Person person= new Person();
        person.setName("name123");
        person.setId(11);

        em.persist(person);
        System.out.println(em.contains(person)); // returns true since it checks in jpa context
    */

        //remove()  actual delete from db and context.
    /*    Person person= new Person();
        person.setName("name123");
        person.setId(12);

        em.persist(person);
        em.remove(person); // only remove the instance in managed state i.e. entity needs to be in jpa context /db

        this will add / insert entity into conext and then deletes it.

        Hibernate: insert into person (name, id) values (?, ?)
        Hibernate: delete from person where id=?

    */

        // remove
        //Hibernate: select person0_.id as id1_0_0_, person0_.name as name2_0_0_ from person person0_ where person0_.id=?
        //Hibernate: delete from person where id=?

        /*Person person= em.find(Person.class,11);
        em.remove(person);
    */

        // merge and refresh


        Person person= new Person();
        person.setId(11);
        person.setName("new");

        //em.merge(person); // update
        //em.flush();
        //System.out.println(em.contains(person)); // print false since it is not checked from database


        //person = em.find(Person.class, 10);
        //System.out.println(em.contains(person)); // returns true snced checked in database.

        em.persist(person);

        //em.clear(); // clear/detach  all entities from conext
        //em.detach(person); // detah specific entity from context

        em.getTransaction().commit();

        em.close();
    }
}
