package rel_services;

import config.AppEntityManager;
import rel_entities.Book;
import rel_entities.BookDetails;
import rel_entities.Children;
import rel_entities.Parent;

import java.util.ArrayList;

public class ParentChildOnetoManyService {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");
        entityManager.getTransaction().begin();

        Children child= new Children();
        child.setName("pummy");
        entityManager.persist(child);

        Parent parent= new Parent();
        parent.setName("pare1");
        parent.setChildren(new ArrayList<>());

        parent.getChildren().add(child);

        entityManager.persist(parent);

        Parent p1 = entityManager.find(Parent.class,3);

        for ( Children children:p1.getChildren() ) {
           System.out.println("children.getName() = " + children.getName());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
