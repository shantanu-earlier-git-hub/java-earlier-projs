package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Price;
import jpa.api.entities.enums.Currency;

public class EnumTempClient {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");


        entityManager.getTransaction().begin();

        Price price= new Price();
        price.setAmount(123.34);
        price.setCurrency(Currency.RUP);

        entityManager.persist(price);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
