package com.volders.springredis;

import com.volders.springredis.model.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SpringredisApplication {

  @Bean
  JedisConnectionFactory jedisConnectionFactory(){
    return new JedisConnectionFactory();
  }

  @Bean
  RedisTemplate<String, Question> redisTemplate2(){
    RedisTemplate<String, Question> redisTemplate2 = new RedisTemplate();
    redisTemplate2.setConnectionFactory(jedisConnectionFactory());
    return redisTemplate2;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringredisApplication.class, args);
  }

}
