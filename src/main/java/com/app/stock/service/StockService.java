package com.app.stock.service;

import com.app.stock.entity.Stock;
import com.app.stock.repository.StockRepository;
import com.app.stock.service.exception.StockNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * stockservice.
 */
@Service
public class StockService {
  private final StockRepository stockRepository;

  /**
   * stockservice.
   *
   * @param stockRepository the stockrepository
   */
  @Autowired
  public StockService(StockRepository stockRepository) {
    this.stockRepository = stockRepository;
  }

  /**
   * createstock.
   *
   * @param stock the stock
   * @return stock
   */
  public Stock createStock(Stock stock) {
    return stockRepository.save(stock);
  }

  /**
   * getstock.
   *
   * @param productId the productId
   * @return stock
   */
  public Stock findByProductId(Long productId) {
    Optional<Stock> stock = stockRepository.findById(productId);
    if (stock.isEmpty()) {
      throw new StockNotFoundException();
    }
    return stock.get();
  }
}