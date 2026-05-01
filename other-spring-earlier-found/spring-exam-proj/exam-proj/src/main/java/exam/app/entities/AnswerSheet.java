package exam.app.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "answersheet")
public class AnswerSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @OneToOne
    @JoinColumn(name = "questionid", referencedColumnName = "id")
    private Question question;

    @Column(name = "studentanswer")
    private Integer studentAnswer;


}
