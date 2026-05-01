package mongo.app.entity.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mongo.app.entity.company.embed.Address;
import mongo.app.entity.company.embed.Details;
import mongo.app.entity.projects.Projects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "company")
public class Company {

    @Id
    private String id;

    @Field(value = "name")
    private String name;

    @Field(value = "address")
    private Address address;

    @Field(value = "startup", targetType = FieldType.BOOLEAN)
    private boolean isStartUp;

    @Field(value = "numofemp", targetType = FieldType.INT32)
    private Integer numOfEmployees;

    private String ceo;

    private String business;

    @Field(value = "details")
    private Details details;

    @Field("projectIds")
    @DocumentReference
    private Projects projects;

}

