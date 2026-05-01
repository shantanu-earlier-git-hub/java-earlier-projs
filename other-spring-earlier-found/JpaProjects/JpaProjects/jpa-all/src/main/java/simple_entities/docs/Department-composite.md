# Department Table Composite

The Java File Name(s) =

1. [Department](../Department.java)
2. [DepartmentPK](../pk/DepartmentPk.java)

### Composite Primary - Option1

Let's say we have a table called Department , It has two primary keys Department code and number

```html
    @Id
    private String code;

    @Id
    private Integer number;

```

As per JPA specification the class/ Object structure  
of such table is defined with separate Embeddable Class. e.g. DepartmentPK. Normally which should have same id columns
types defines as ids in primary class.

However, that class would be ...

1. provided both attributes where update = false and insert =false.
2. It should implement Serializable interface.

```html

@Embeddable
public class DepartmentPk implements Serializable {

    @Column(insertable = false , updatable = false)
    private String name;

    @Column(insertable = false , updatable = false)
    private Integer number;
}
```

and the main class will be

```html
@Entity
@IdClass(DepartmentPk.class)
public class Department {

    @Id
    private String code;

    @Id
    private Integer number;

    private String name;

    @Embedded
    DepartmentPk departmentPk;

}
```

As per JPA , we have another way for implementing it using EmbeddedId.

## EmbeddedId -Option2

So we need to change Department class as follows...

```html
@Entity
public class Department {

    @EmbeddedId
    DepartmentPk departmentPkId;

    private String name;
}
```

DepartmentPk class will be as it is; it should implement Serializable class too.

## Use in Queries

But when we want to access the values in queries ...

1. Using @IdClass(DepartmentPk.class)

```html
select dept.name, dept.number, dept.code from Department d;  
```

1. Using @EmbeddedId DepartmentPk departmentPkId = new DepartmentPk();

we need to use by using following way.

```html
select dept.name, dept.departmentPkId.number, dept.departmentPkId.code from Department d;  
```

### Using Attribute Override in @EmbeddedId

if Column name in @Embeddable DepartmentPK is different and Not used @Column annotation, then by using
@AttributeOverride we can set the column name mapping for @EmbeddedId Type Composite Key attribute relation.

```html
    @EmbeddedId
    @AttributeOverride(name = "num", column = @Column(name = "number"))
    DepartmentPk departmentPkId= new DepartmentPk();

```


