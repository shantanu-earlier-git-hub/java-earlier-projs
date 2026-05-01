package app.services;

import app.config.AppEntityManager;
import app.entities.Professor;
import app.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;

import java.util.HashMap;

public class MapServices {


    public static void main(String[] args) {

        var em = AppEntityManager.getEntityManager("mysql-jpa");

        Professor professor= new Professor();
        professor.setName("prof1");

        Student student = new Student();
        student.setName("student1");

        professor.setStudents(new HashMap<>());
        professor.getStudents().put("course1", student);

        em.getTransaction().begin();
        em.persist(professor);
        //em.persist(student);
        em.getTransaction().commit();
        em.close();

    }


}
