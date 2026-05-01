package services.onetomany;

import entities.onetomany.Comment;
import entities.onetomany.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class CommentService {

    private static void add(EntityManager em) {
        em.getTransaction().begin();

        var p = new Post("post 1");
        var c = new Comment("comment 1");

        p.setComments(List.of(c));
        //
        em.persist(c);
        em.persist(p);
        //
        em.getTransaction().commit();
        em.close();
    }

    private static void fetchPost(EntityManager em) {
        em.getTransaction().begin();
        String hql = "FROM Post p";
        Query query = em.createQuery(hql);
        var results = query.getResultList();

        System.out.println("results.toString() = " + results.toString());

        em.getTransaction().commit();
        em.close();
    }


    public static void main(String[] args) {

        var em = Persistence.createEntityManagerFactory("mysql-jpa").createEntityManager();
        fetchPost(em);
        //add(em);

    }
}
