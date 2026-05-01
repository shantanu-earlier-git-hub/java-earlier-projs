# Event

The Java File Name(s) =
[Event](../Event.java)

Using id as String if required then Generic Generator can be used.

1. Can use 1st strategy as org.hibernate.id.UUIDHexGenerator.
2. Can use org.hibernate.id.UUIDGenerator too.
3. Can provide the parameters if we want a separator.
4. @GeneratedValue(generator = "generic_generator") is needed to auto generate the values.

```html

@Entity
public class Event {
    @Id
    @GenericGenerator(name = "generic_generator",
            strategy = "org.hibernate.id.UUIDHexGenerator",
            parameters = {@Parameter(name = "separator", value = "-")}
    )
    @GeneratedValue(generator = "generic_generator")
    private String id;
}
```

When using org.hibernate.id.UUIDGenerator id field need to be UUID. Hibernate has other Generators too to create ids.

```html

@Entity
public class Event {
    @Id
    @GenericGenerator(name = "generic_generator",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@Parameter(name = "separator", value = "-")}
    )
    @GeneratedValue(generator = "generic_generator")
    private UUID id;
}
```
