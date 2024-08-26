package com.app.stock.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
  private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
  private final KafkaTemplate<String, String> kafkaTemplate;
  private static String staticTopicStock;

  /**
   * messageservice.
   *
   * @param kafkaTemplate the kafkatemplate
   * @param topicStock the topicstock
   */
  @Autowired
  public MessageService(KafkaTemplate<String, String> kafkaTemplate, @Value(
      "${topic.stock}") String topicStock) {
    this.kafkaTemplate = kafkaTemplate;
    staticTopicStock = topicStock;
  }

  /**
   * sendmessage.
   *
   * @param message the message
   */
  public void sendMessage(String message) {
    logger.info("Message -> {}", message);
    this.kafkaTemplate.send(staticTopicStock, message);
  }
}