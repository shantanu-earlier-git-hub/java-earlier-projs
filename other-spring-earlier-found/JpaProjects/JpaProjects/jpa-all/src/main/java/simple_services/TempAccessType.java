package simple_services;

import config.AppEntityManager;
import simple_entities.Temp;

public class TempAccessType {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");

        Temp temp = new Temp();

        entityManager.getTransaction().begin();
        temp.setName("some name");

        entityManager.persist(temp);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
