package com.volders.springredis.controller;

import com.volders.springredis.model.Question;
import com.volders.springredis.repo.QuestionRepo;
import java.io.IOException;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class QuestionController {

  private QuestionRepo questionRepo;
  public Question q = new Question();

  public QuestionController(QuestionRepo questionRepo) {
    this.questionRepo = questionRepo;
  }

  //redirect
  @GetMapping("")
  void index(HttpServletResponse response) throws IOException {
    response.sendRedirect("question");
  }

  //get form
  @GetMapping("/question")
  public String getForm() {
    return "question";
  }

  //get form
  @GetMapping("/answer")
  public String getAnswer(Model model) {
//    model.addAttribute("question", questionRepo.findById(q.getId()));
    model.addAttribute("question", q);
    return "answer";
  }

  @PostMapping("/question")
  public String askQuestion(@RequestParam("question") String question, Model model) {
//
//    if (this.service.exists("authorcount")) {
//      this.service.incr("authorcount");
//    } else {
//      this.service.setKey("authorcount", "1");
//    }
    q.setQuestion(question);
    questionRepo.save(q);
    return "redirect:/answer";  }


//  //request
//  @GetMapping("/save/{question}/")
//  public Question add(
//      @PathVariable("question") String question){
//    Question q;
//    questionRepo.save(q = new Question(question));
//    return questionRepo.findById(q.getId());
//  }

}
