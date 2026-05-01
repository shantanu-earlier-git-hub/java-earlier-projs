package jpa.app.services;

import jpa.app.config.AppEntityManager;
import jpa.app.entities.Student;
import jpa.app.entities.Teacher;

import java.util.ArrayList;

public class M2M1DirService {



    public static void main(String[] args) {


        var entityManager = AppEntityManager.getEntityManager("postgresql-jpa");

        entityManager.getTransaction().begin();

        entityManager.clear();
        Teacher t1= new Teacher();
        t1.setName("teacher 2");

        Student s1= new Student();
        s1.setName("s2");

        s1.setTeachers(new ArrayList<>());
        s1.getTeachers().add(t1);

        t1.setStudents(new ArrayList<>());
        t1.getStudents().add(s1);

        entityManager.persist(t1);
        //entityManager.persist(s1);

        entityManager.getTransaction().commit();;
        entityManager.close();
    }
}
