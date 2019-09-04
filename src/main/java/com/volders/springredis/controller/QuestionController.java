package com.volders.springredis.controller;

import com.volders.springredis.model.Question;
import com.volders.springredis.repo.QuestionRepo;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QuestionController {

  private QuestionRepo questionRepo;

  public QuestionController(QuestionRepo questionRepo) {
    this.questionRepo = questionRepo;
  }

  @GetMapping("/save/{question}/")
  public Question add(
      @PathVariable("question") String question){
    Question q;
    questionRepo.save(q = new Question(question));
    return questionRepo.findById(q.getId());
  }

  @GetMapping("/all")
  public Map<String,Question> getall(){
    return questionRepo.findall();
  }



}
