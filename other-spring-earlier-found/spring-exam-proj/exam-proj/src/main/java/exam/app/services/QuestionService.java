package exam.app.services;


import org.springframework.stereotype.Service;
import exam.app.repositories.QuestionRepository;
import exam.app.entities.Question;

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
