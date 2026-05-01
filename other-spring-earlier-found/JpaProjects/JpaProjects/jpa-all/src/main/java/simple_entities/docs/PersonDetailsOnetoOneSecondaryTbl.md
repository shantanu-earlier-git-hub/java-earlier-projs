# Person to Person-Details @OnetoOne

The Java File Name(s) =
[Person](../Person.java)

# Use of Secondary Table

JPA provides @SecondaryTable annotation to map two tables into single Entity by using @SecondaryTable annotations.

```html
@Entity
@SecondaryTable(name = "PersonDetails")
public class Person {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(table = "PersonDetails")
    private String email;

    @Column(table = "PersonDetails")
    private String phone;
}
```

In this example personId should be a foreign key for PersonDetails Table, but we haven't specified it here. we have
created two tables Person and PersonDetails; PersonDetails Table has person as foreign key(it is nullable)

Above example will work if person is null, as it doesn't expect any value in place of peron column.If foreign key person
is **not** nullable then we need make following modifications.

```html
@Entity
@SecondaryTable(name = "PersonDetails", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person"))
public class Person {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(table = "PersonDetails")
    private String email;

    @Column(table = "PersonDetails")
    private String phone;
}
```

Please note we changed to let JPA know, what is column where we have primary @OntoOne relation.

```html
@SecondaryTable(name = "PersonDetails", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person"))
```

the code for service class in this case is ...

```html
        Person p1= new Person();
        p1.setName("person Name");

        p1.setEmail("person@email.com");
        p1.setPhone("784438478");

        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.getTransaction().commit();
       
```

we can have as many secondary tables ...

check the code below.

```html
@Entity
@SecondaryTable(name = "PersonDetails", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person"))
@SecondaryTable(name = "Misc", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person"))
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(table = "PersonDetails")
    private String email;

    @Column(table = "PersonDetails")
    private String phone;

    @Column(table = "Misc")
    private String details;

}
```

