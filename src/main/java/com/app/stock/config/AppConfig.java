package com.app.stock.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  /**
   * topicuser.
   */
  @Value("${topic.user}")
  private static String topicUser;

  /**
   * topicuser.
   *
   * @return topicuser
   */
  @Bean
  public static String staticTopicUser() {
    return topicUser;
  }
}
