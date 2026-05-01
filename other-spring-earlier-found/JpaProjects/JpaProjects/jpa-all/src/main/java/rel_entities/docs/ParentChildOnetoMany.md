# Parent Child OnetoMany

Two tables Parent and Children

```html
class/table Parent {
    @Id
    private Integer id;
    
    private String name;
}
```
```html
class/table Children {
@Id
private Integer id;

private String name;
}
```
These tables doesn't have any type relationship 
between them.

Logically , Parent class has many children, hence
We will have Collection of Children.

But adding that attribute of collection doesn't solve the
requirement.

We need to have Parent_Children table where we can store
the id mappings of parent_id and children_id as keys.

```html
@Table
Parent_Children{
    parent_id int,
    children_id int
}
```



