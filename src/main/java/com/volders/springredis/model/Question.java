package com.volders.springredis.model;

import java.io.Serializable;

public class Question implements Serializable {

  private static int counter = 0;
  private String id;
  private String question;
  private String answer;
  private AnswersEnum answersEnum;

  public Question(String question) {
    id = String.valueOf(++counter);
    this.question = question;
    this.answer = answersEnum.randomAnswer().toString();
  }

  public Question() {
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

  @Override
  public String toString() {
    return "Question{" +
        "id='" + id + '\'' +
        ", question='" + question + '\'' +
        ", answer='" + answer + '\'' +
        '}';
  }
}
