package simple_services;

import config.AppEntityManager;
import simple_entities.Price;
import simple_entities.enums.Currency;

public class PriceEnumService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");


        entityManager.getTransaction().begin();

        Price price = new Price();
        price.setAmount(123.34);
        price.setCurrency(Currency.RUP);

        entityManager.persist(price);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
