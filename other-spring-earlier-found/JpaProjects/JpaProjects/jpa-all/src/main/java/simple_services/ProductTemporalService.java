package simple_services;

import config.AppEntityManager;
import simple_entities.ProductTemporal;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ProductTemporalService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");

        entityManager.getTransaction().begin();

        ProductTemporal pt = new ProductTemporal();

        //emp.setJoinDate(LocalDate.now());
        //emp.setJoinDate(LocalDateTime.now());

        //emp.setJoinDate(ZonedDateTime.now(ZoneId.of("Europe/London")));

        pt.setExpirationDate(LocalDate.now());
        pt.setUpdatedDate(Timestamp.valueOf(LocalDateTime.now()));
        pt.setCreated_date(new Date());

        entityManager.persist(pt);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
