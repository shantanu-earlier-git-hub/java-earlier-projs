package mongo.app.entity.projects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mongo.app.entity.employee.Employee;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection= "projects")
public class Projects {

    @Id
    private String id;

    private String name;

    private String projectCode;

    @Field(value = "startdate", targetType = FieldType.DATE_TIME)
    private Date startedDate;

    @Field(value = "enddate", targetType = FieldType.DATE_TIME)
    private Date endDate;

    @Field(value = "managername")
    private String managerName;

    @Field(value = "budget", targetType = FieldType.DOUBLE)
    private Double budgetAmount;

    @Field("employeeIds")
    @DocumentReference
    private List<Employee> employees;


}
