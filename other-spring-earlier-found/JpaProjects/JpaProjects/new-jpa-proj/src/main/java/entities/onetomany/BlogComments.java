package entities.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *
 *  unidirectional with @JoinColumn
 */

@Entity
@Data
@NoArgsConstructor
public class BlogComments {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;


    public BlogComments(String content) {
        this.content = content;
    }
}
