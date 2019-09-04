package com.volders.springredis.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum AnswersEnum {

  a("It is certain"),
  b("It is decidedly so"),
  c("Without a doubt"),
  d("Yes - definitely"),
  e("You may rely on it"),
  f("As I see it, yes"),
  g("Most likely"),
  h("Outlook good"),
  i("Yes"),
  j("Signs point to yes"),
  k("Reply hazy, try again"),
  l("Ask again later"),
  m("Better not tell you now"),
  n("Cannot predict now"),
  o("Concentrate and ask again"),
  p("Don't count on it"),
  q("My reply is no"),
  r("My sources say no"),
  s("Outlook not so good"),
  t("Very doubtful");

  private String info;

  AnswersEnum(String info) {
    this.info = info;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  private static final List<AnswersEnum> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int SIZE = VALUES.size();
  private static final Random RANDOM = new Random();

  public static AnswersEnum randomAnswer() {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }

  @Override
  public String toString() {
    return info;
  }
}
