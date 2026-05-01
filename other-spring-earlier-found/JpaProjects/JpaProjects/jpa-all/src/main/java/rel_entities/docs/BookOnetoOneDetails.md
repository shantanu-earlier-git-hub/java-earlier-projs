# @OnetoOne { Book and It's Details }

Relation Between Entities Tables will be Uni-directional or Bi-directional.

One row of Book will have One Details....

# [ One Directional - Option 1 ]

We define @OnetoOne annotation for Book attribute in BookDetail Entity and nothing in Book Entity. 

So Book Entity doesn't know anything about details. BookDetail Table has reference column for Book(book_id)
the column name needs ot be as above as per JPA specs.

```html

@Entity
public class BookDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    @OneToOne
    private Book book;


}
```
When we create Book first and Details later and persists both sequentially. It works but needs 2 persists one
for Book and Other for details. 

To avoid those two persist. Change above code to ...

```html
@Entity
public class BookDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Book book;


},
```
In Service...

```html
  Book book = new Book();
        BookDetails details = new BookDetails();

        book.setBookName("some name");
        book.setPrice(100.34);
      //  entityManager.persist(book);

        details.setAuthor("falatu author");
        details.setBook(book);

        entityManager.persist(details);
```

As per JPA spec the foreign key needs to be <tablename>_id . But if it is not then we need to use 
@JoinColumn annotation to specify the different column name.

It can be done as follows.

```html
@Entity
public class BookDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    @JoinColumn(name = "book")
    @OneToOne(cascade = CascadeType.PERSIST)
    private Book book;


}
```
All Above is Uni-directional relationship. 

## [ Bi-Directional Relationship -Option 2 ]

When use bidirectional relationship, when we load either of entity
other dependent entity will be fetched along with it.

Use bidirectional if really needed in requirement.

to do that , we would need to add @OnetoOne in other side
of owner of relationship, means in that entity where 
foreign key is not defined in table.

```html
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String bookName;

    private Double price;

    @OneToOne(mappedBy = "book", optional = false)
    private BookDetails bookDetails;

}

```
If we see above code     
@OneToOne(mappedBy = "book", optional = false)

added to mention what is the relationship with detail.
and attribute name is provided to mappedBy property.

If Optional is false then while adding a record foreign
key should be present otherwise optional=true(default).
 
In bi-directional ... each entity set other relative entity
value before persist.

```html
    details.setBook(book);
    book.setBookDetails(details);
```
Other options for @OnetoOne mapping are ...
1. we can specify fetch Type as Lazy where dependent
entity values will be loaded when we call by method.
2. If it is Eager then when the entity loaded other
dependent entity data will also be loaded.
  
Target entity and Cascade, will se in other relationship types.
