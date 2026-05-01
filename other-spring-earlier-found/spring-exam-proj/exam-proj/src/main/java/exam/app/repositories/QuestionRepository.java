package exam.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import exam.app.entities.Question;


public interface QuestionRepository extends JpaRepository<Question, Integer> {


}
