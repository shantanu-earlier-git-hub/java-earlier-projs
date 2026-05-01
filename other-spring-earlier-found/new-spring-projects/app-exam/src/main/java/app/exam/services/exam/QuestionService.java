package app.exam.services.exam;

import app.exam.repository.exam.QuestionRepository;
import app.exam.resource.entities.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void addNew(Question question) {
        this.questionRepository.save(question);
    }

    public void update(List<Question> questions) {
        this.questionRepository.saveAll(questions);
    }

    public List<Question> getAll() {
        return this.questionRepository.findAll();
    }

}
