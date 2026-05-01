package exam.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "paper")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "examid", referencedColumnName = "id")
    private Exam exam;

    @Column(name = "totalquestions")
    private Integer totalQuestions;

    @OneToMany
    private List<Question> questions;

}
