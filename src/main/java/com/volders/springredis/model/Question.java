package com.volders.springredis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Question implements Serializable {

  private static int counter = 0;
  private String id;
  private String question;
  private AnswersEnum answersEnum;
  private List<String> answers;
  private String answer;

  public Question(String question) {
    id = String.valueOf(++counter);
    this.question = question;
    this.answer = answersEnum.randomAnswer().toString();
    answers = new ArrayList<>();
    this.answers.add(answer);
  }

  public Question() {
    this("Zuig ik in webTech?");
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public List<String> getAnswers() {
    return answers;
  }

  //TODO
//  public void addAnswer(String answer) {
//  }

  @Override
  public String toString() {
    return "Question{" +
        "id='" + id + '\'' +
        ", question='" + question + '\'' +
        ", answer='" + answer + '\'' +
        '}';
  }
}
