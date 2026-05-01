package jpa.app.services;

import jpa.app.config.Module2EntityManager;
import jpa.app.entities.Documents;
import jpa.app.entities.Writer;

import java.util.List;



public class WriterDocumentService {

    private  void display(){
        var entityManager = Module2EntityManager.getEntityManager("postgresql-jpa");
        entityManager.getTransaction().begin();

/*
        Writer writer= new Writer();
        writer.setId(2);
        writer.setName("person1");
        //entityManager.persist(writer);

        Documents documents= new Documents();
        documents.setName("spec doc");
        documents.setWriter(writer);
        entityManager.persist(documents);
*/

        List<Writer> writerList = entityManager.createQuery("select  w from Writer w").getResultList();
        for (Writer writer:
                writerList
        ) {
            System.out.println("writer id = " + writer.getId() +  "  name = " + writer.getName());
            List<Documents> documentsList = (List<Documents>) writer.getDocuments();
            System.out.println("documents");
            for (Documents doc:documentsList
            ) {
                System.out.println("id = " + doc.getId() + " name = " + doc.getName());
            }

        }
//        entityManager.getTransaction().commit();
        entityManager.close();

    }


    public static void main(String[] args) {

        new WriterDocumentService().display();


    }
}
