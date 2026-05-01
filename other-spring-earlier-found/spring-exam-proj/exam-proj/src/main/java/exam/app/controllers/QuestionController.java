package exam.app.controllers;


import org.springframework.web.bind.annotation.*;
import exam.app.resources.QuestionForm;
import exam.app.entities.Question;
import exam.app.services.QuestionService;

import java.util.List;


@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService= questionService;
    }


    @GetMapping("/all")
    public Question[] getQuestions() {

        System.out.println("entering getQuestions Controller");
        List<Question> qlist = this.questionService.getAll();
        System.out.println("the list size : " + qlist.size());
        Question[] questions = new Question[qlist.size()];
        //QuestionForm[] questionForms= new QuestionForm[qlist.size()] ;

        for(int i=0; i<qlist.size(); i++){
            questions[i] =qlist.get(i);
          }

        System.out.println("exiting  getQuestions Controller");
        return questions;
    }

    @PostMapping("/update")
    public void updateQuestions(@RequestBody QuestionForm[] questionForms) {

    }

    @PostMapping("/add")
    public void addNew(@RequestBody QuestionForm questionForm) {


        Question question = new Question();

        question.setQuestion(questionForm.getQuestion());
        question.setAnswer(questionForm.getAnswer());
        question.setComplexity(questionForm.getComplexity());
        question.setSubject(questionForm.getSubject());
        question.setOption1(questionForm.getOption1());
        question.setOption2(questionForm.getOption2());
        question.setOption3(questionForm.getOption3());
        question.setOption4(questionForm.getOption4());
        this.questionService.addNew(question);
    }

}
