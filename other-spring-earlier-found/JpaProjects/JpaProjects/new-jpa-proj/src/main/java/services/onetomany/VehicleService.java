package services.onetomany;

import config.AppEntityManager;
import entities.onetomany.Dealer;
import entities.onetomany.Vehicle;

public class VehicleService {

    public static void main(String[] args) {
        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        entityManager.getTransaction().begin();
        var dealer = new Dealer("new dealer", "some location");
        var vehicle = new Vehicle("honda", "2022");
        vehicle.setDealer(dealer);
        //
        entityManager.persist(vehicle);
        entityManager.persist(dealer);
        //
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
