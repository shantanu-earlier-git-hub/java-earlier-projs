package clients;

import entities.Authorities;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class AuthorityClient {


    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-jpa");
        EntityManager em=  emf.createEntityManager();

        String qString = "select auth from Authorities auth , " +
                "ModuleRole mr where auth.moduleId = mr.module and " +
                "auth.roleId = mr.role and mr.role " +
                "in (select ur.role from UserRole ur where ur.user = :userId ) ";

        em.getTransaction().begin();

        Query query = em.createQuery(qString, Authorities.class);
        query.setParameter("userId" , 5);

        List<Authorities> authList= query.getResultList();
        authList.forEach(System.out::println);

        em.close();
        em.getTransaction().commit();

    }
}
