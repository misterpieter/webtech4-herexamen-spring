package com.volders.springredis.service;

import com.volders.springredis.model.Question;
import com.volders.springredis.repo.QuestionRepo;
import java.util.List;
import java.util.Map;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionService implements QuestionRepo {


  private RedisTemplate<String, Question> redisTemplate2;
  private HashOperations hashOperations;


  public QuestionService(
      RedisTemplate<String, Question> redisTemplate2) {
    this.redisTemplate2 = redisTemplate2;
    hashOperations = redisTemplate2.opsForHash();
  }

  @Override
  public Question findById(int id) {
    return (Question) hashOperations.get("Question",id);
  }

  @Override
  public void save(Question question) {
    hashOperations.put("Question", question.getId(), question);
  }

  @Override
  public Map<String, Question> findall() {
    return hashOperations.entries("Question");
  }
}
