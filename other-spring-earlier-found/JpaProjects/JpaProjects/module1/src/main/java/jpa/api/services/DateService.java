package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Emp;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();

        Emp emp= new Emp();

        //emp.setJoinDate(LocalDate.now());
        //emp.setJoinDate(LocalDateTime.now());

        //emp.setJoinDate(ZonedDateTime.now(ZoneId.of("Europe/London")));

        emp.setJoinDate(new Date());

        entityManager.persist(emp);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
