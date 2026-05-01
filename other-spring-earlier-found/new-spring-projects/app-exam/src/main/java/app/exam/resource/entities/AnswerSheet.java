package app.exam.resource.entities;

import lombok.Data;

import javax.persistence.*;

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
