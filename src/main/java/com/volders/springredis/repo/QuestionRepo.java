package com.volders.springredis.repo;

import com.volders.springredis.model.Question;
import java.util.Map;

public interface QuestionRepo {

  void save(Question question);
  Map<String,Question> findall();
  void delete(String id);
  void update(Question user);
  Question findById(String id);
}
