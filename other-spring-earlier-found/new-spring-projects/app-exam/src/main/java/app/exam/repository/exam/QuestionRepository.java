package app.exam.repository.exam;

import app.exam.resource.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionRepository extends JpaRepository<Question, Integer> {


}
