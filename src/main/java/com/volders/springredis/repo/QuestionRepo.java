package com.volders.springredis.repo;

import com.volders.springredis.model.Question;
import java.util.List;
import java.util.Map;

public interface QuestionRepo {

  void save(Question question);
  Question findById(int id);
  Map<String,Question> findall();
}
