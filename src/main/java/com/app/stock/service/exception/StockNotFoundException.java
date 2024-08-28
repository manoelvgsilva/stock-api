package com.app.stock.service.exception;

/**
 * stocknotfoundexception.
 */
public class StockNotFoundException extends RuntimeException {
  public StockNotFoundException() {
    super("Estoque não encontrado!");
  }
}