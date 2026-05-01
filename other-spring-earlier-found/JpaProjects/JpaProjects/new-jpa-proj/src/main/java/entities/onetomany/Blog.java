package entities.onetomany;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/***
 *
 *  unidirectional with @JoinColumn
 *  no third table of ids will be created, normally @JoinColumn will be at ownership side
 *  but here relationship at opposite side hence need to mention name of the key for jpa to create
 *  at owner table
 */


@Entity
@Data
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;

    @OneToMany
    @JoinColumn(name = "blog_id")
    private List<BlogComments> comments;

    public Blog(String content) {
        this.content = content;
    }

}
