package services.onetomany;


import entities.onetomany.Blog;
import entities.onetomany.BlogComments;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.Arrays;

public class BlogService {

    public static void main(String[] args) {

        var em = Persistence.createEntityManagerFactory("mysql-jpa")
                .createEntityManager();
        //add(em);
        fetchPost(em);

    }


    private static void add(EntityManager em) {
        em.getTransaction().begin();

        var p = new Blog("blog 1");
        var b1 = new BlogComments("comment 1");
        var b2 = new BlogComments("comment 2");

        var b3 = Arrays.asList(b1, b2);
        p.setComments(b3);
        //
        em.persist(b1);
        em.persist(b2);
        em.persist(p);
        //
        em.getTransaction().commit();
        em.close();
    }

    private static void fetchPost(EntityManager em) {
        em.getTransaction().begin();
        String hql = "select b FROM Blog b";
        Query query = em.createQuery(hql);
        var results = query.getResultList();

        System.out.println("results.toString() = " + results.toString());

        em.getTransaction().commit();
        em.close();
    }

}
