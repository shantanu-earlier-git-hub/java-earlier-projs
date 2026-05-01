# Product

The Java File Name(s) =
[product](../Product.java)

## SimpleEntity - Option 1

To begin ... for mysql we can set AI (Auto Increment ) property for the primary column and set strategy =
GenerationType.IDENTITY.

```html

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
```

## SimpleEntity - Option 2

if using hibernate and MySql . A new Table needed hibernate_sequence which has only one column as next_val as BigInt and
no need to provide strategy as AUTO,since it is default.

```mysql
create table hibernate_sequence
(
    next_val BigInt

)
```

```html

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
```

## SimpleEntity - Option 3

for below type new table needed to be created by name provided in generator name : seq_generator

```mysql
Create Table seq_generator
(
    sequence_name varchar(45),
    next_val      Int
)
```

```html

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seq_generator")
    private Integer id;
}
```

## SimpleEntity - Option 4

Table Generator Strategy example as shown below.

```html

@TableGenerator(
        name = "product_sequence",
        pkColumnName = "sequence_name",
        pkColumnValue = "prod_seq",
        initialValue = 1,
        allocationSize = 1,
        valueColumnName = "next_val"

)
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seq_generator")
    private Integer id;
}
```   

## SimpleEntity -Option 5

Sequence Generator Strategy

```html

@Entity
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private Integer id;
}
```
