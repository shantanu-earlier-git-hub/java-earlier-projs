package mongo.app.entity.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "movies")
public class Movies {

    @Id
    private Integer _id;

    private String url;
    private String name;
    private String type;
    private String language;

    private List<String> genres;

    private String status;
    private Integer runtime;
    private LocalDateTime premiered;
    private String officialSite;
    private LocalDateTime schedule;
    private String rating;
}
