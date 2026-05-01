package simple_services;

import config.AppEntityManager;
import simple_entities.Event;

public class EventService {


    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");
        Event e1 = new Event();
        e1.setEventName("some event");

        entityManager.getTransaction().begin();

        entityManager.persist(e1);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
