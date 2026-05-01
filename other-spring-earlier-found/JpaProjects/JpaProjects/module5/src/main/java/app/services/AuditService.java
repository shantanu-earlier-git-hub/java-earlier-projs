package app.services;

import app.entities.Car;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuditService {

    public static void main(String[] args) {

        EntityManagerFactory emf;
        EntityManager em;
        emf = Persistence.createEntityManagerFactory("mysql-jpa");
        em = emf.createEntityManager();

        /*Car car= new Car();
        car.setName("new car");
*/
        em.getTransaction().begin();

/*
        Car car = em.find(Car.class, 1);

        car.setName("new car2");
        car.setUpdatedBy("updated");
*/


        Car foundCar = em.find(Car.class , 1);

        Cache cache= emf.getCache();

        System.out.println("is present in cache ? : " + cache.contains(Car.class, 1));

        //em.persist(car);
        em.getTransaction().commit();
        em.close();

    }

}
