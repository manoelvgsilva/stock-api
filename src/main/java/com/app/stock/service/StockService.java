package com.app.stock.service;

import com.app.stock.entity.Stock;
import com.app.stock.repository.StockRepository;
import com.app.stock.service.exception.StockNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
  public Stock findByProductId(String productId) {
    Optional<Stock> stock = stockRepository.findByProductId(productId);
    if (stock.isEmpty()) {
      throw new StockNotFoundException();
    }
    return stock.get();
  }

  /**
   * upstock.
   *
   * @param productId the productid
   * @return stock
   */
  public Stock upStockOfProduct(String productId) {
    Optional<Stock> stock = stockRepository.findByProductId(productId);
    if (stock.isEmpty()) {
      throw new StockNotFoundException();
    }
    Stock upStock = stock.get();
    upStock.setQuantityPresent(upStock.getQuantityPresent());
    stockRepository.save(upStock);
    return upStock;
  }
}