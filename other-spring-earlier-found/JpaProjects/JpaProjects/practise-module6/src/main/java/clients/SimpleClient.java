package clients;

import entities.Role;
import entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class SimpleClient {

    public static void main(String[] args) {

        EntityManagerFactory emf;

        EntityManager em;

        emf= Persistence.createEntityManagerFactory("mysql-jpa");
        em= emf.createEntityManager();

        Role role = new Role();
        role.setName("admin");

        User user = new User();
        user.setName("john");

        role.setUsers(new ArrayList<>());
        role.getUsers().add(user);

        user.setRoles(new ArrayList<>());
        user.getRoles().add(role);


        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();



    }
}
