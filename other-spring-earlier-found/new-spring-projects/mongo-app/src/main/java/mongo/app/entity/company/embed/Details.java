package mongo.app.entity.company.embed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Details {

    @Field(value = "sharePrice", targetType = FieldType.DOUBLE)
    private Double sharePrice;

    @Field(value = "website")
    private String webSite;

    @Field(value = "funding", targetType = FieldType.DOUBLE)
    private Double funding;

    private ArrayList<String> phone;

    @Field(value = "listedIn")
    private ArrayList<String> listedIn;

}
