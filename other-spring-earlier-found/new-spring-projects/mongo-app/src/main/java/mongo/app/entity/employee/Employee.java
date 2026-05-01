package mongo.app.entity.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "employee")
public class Employee {

    @MongoId
    private String id;

    @Field(name="name", targetType = FieldType.STRING)
    private String name;

    @Field(name="title", targetType = FieldType.STRING)
    private String title;

    @Field(name="rate", targetType = FieldType.DOUBLE)
    private Double rate;


}
