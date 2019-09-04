package com.volders.springredis.repo;

import com.volders.springredis.model.Question;

public interface QuestionRepo {

  void save(Question question);
  Question findById(String id);
}
