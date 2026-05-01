# Product Temporal

The Java File Name(s) =
[ProductTemporal](../ProductTemporal.java)

## Temporal Type

1. Zoned Date
2. LocalDate
3. TemporalDate Type

Zoned Date in JPA is same as LocalDate.

```html
setJoinDate(ZonedDateTime.now(ZoneId.of("Europe/London")));
```

For TemporalDate

```html
@Temporal(TemporalType.TIMESTAMP)
private Date updatedDate;
```
