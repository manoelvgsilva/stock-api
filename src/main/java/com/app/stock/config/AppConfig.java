package com.app.stock.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * appconfig.
 */
@Configuration
public class AppConfig {

  /**
   * topicstock.
   */
  @Value("${topic.stock}")
  private static String topicStock;

  /**
   * topicstock.
   *
   * @return topicstock
   */
  @Bean
  public static String staticTopicStock() {
    return topicStock;
  }
}
