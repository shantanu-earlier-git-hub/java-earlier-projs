# Company Address Embeddable

## Company Address

company table has id and other fields

those can be splitted into two different classes

1.Company which has id and name

```html

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

   @Embedded
   Address address;
```

2. Address , which has city and state

```html
@Embeddable
public class Address {
    private String city;
    private String state;
}

```

3. when try to persist , we can use company.address to store values common to address.

```html
  company.setAddress(address);
```

## AttributeOverride

when using embeddable type. If want to give different attribute names in the entity other than column names in table

we can use following ...It will work only for
**_jdk1.8_** and above.

```html
   @Embedded
   @AttributeOverride(name = "addressCity", column = @Column(name = "city"))
   @AttributeOverride(name = "addressState", column = @Column(name = "state"))
   Address address;
```
