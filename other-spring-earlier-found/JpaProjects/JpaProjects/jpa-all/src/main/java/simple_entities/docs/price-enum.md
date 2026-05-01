# Currency Price Enum

The Java File Name(s) =
[Price](../Price.java)

## Simple entity - Price

The Enumeration can be used a Ordinal or as String type

1. If Chosen as Ordinal then 1,2,3 sequences will be stored in DB.
2. If Chosen as String then respective String names given in Enum will be stored in DB.

### When to use what ?

1. When ou have int as column in db and want to index on that col then ordinal is useful. But is risk since we change
   the seq in Java Class data will be messed.

2. For information of data is concerned String is useful. Strings are recommended.

### Type 1

```html
@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double amount;

    @Enumerated(value = EnumType.ORDINAL)
    private Currency currency;

}
```

### Type 2

```html
@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double amount;

    @Enumerated(value = EnumType.STRING)
    private Currency currency;

}
```
