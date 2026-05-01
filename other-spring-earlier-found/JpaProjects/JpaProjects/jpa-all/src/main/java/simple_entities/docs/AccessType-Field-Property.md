# Access Types

The Java File Name = [Temp](../Temp.java)

# Field

```html
@Entity
@Access(AccessType.FIELD)
public class Temp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
```

# Property

```html
@Entity
@Access(AccessType.PROPERTY)
public class Temp {

    private Integer id;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
```

