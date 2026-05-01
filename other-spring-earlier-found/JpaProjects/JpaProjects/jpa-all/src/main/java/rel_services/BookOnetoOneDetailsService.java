package rel_services;

import config.AppEntityManager;
import rel_entities.Book;
import rel_entities.BookDetails;

public class BookOnetoOneDetailsService {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");
        entityManager.getTransaction().begin();

        Book book = new Book();
        BookDetails details = new BookDetails();

        book.setBookName("some name");
        book.setPrice(100.34);

        details.setAuthor("falatu author");

        details.setBook(book);
        book.setBookDetails(details);

        entityManager.persist(details);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
