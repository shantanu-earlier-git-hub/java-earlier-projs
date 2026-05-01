package jpa.app.services;

import jpa.app.config.AppEntityManager;
import jpa.app.entities.Book;
import jpa.app.entities.Store;
import jpa.app.entities.StoreDetails;

import java.util.Arrays;

public class AssoOverService {

    public static void main(String[] args) {

        var em= AppEntityManager.getEntityManager("postgresql-jpa");


        Store store= new Store();
        store.setName("sto1");

        StoreDetails sd= new StoreDetails();
        sd.setStores(Arrays.asList(store));

        Book b = new Book();
        b.setName("b1");
        b.setStoreDetails(sd);

        em.getTransaction().begin();

        em.persist(store);
        em.persist(b);

        em.getTransaction().commit();
        em.close();

    }
}
