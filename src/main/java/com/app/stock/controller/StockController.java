package com.app.stock.controller;

import com.app.stock.controller.dto.StockCreationDto;
import com.app.stock.controller.dto.StockDto;
import com.app.stock.entity.Stock;
import com.app.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * stockcontroller.
 */
@RestController
@RequestMapping(value = "/stocks")
public class StockController {
  private final StockService stockService;

  /**
   * stockcontroller.
   *
   * @param stockService the stockservice
   */
  @Autowired
  public StockController(StockService stockService) {
    this.stockService = stockService;
  }

  /**
   * createstock.
   *
   * @param stockCreationDto the stockcreationdto
   * @return stock
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public StockDto createStock(
      @RequestBody StockCreationDto stockCreationDto
  ) {
    return StockDto.fromEntity(
        stockService.createStock(stockCreationDto.toEntity())
    );
  }

  /**
   * getProduct.
   *
   * @param productId the productId
   * @return product
   */
  @GetMapping("/{productId}")
  public StockDto getProduct(@PathVariable Long productId) {
    Stock getStock = stockService.findByProductId(productId);
    return StockDto.fromEntity(getStock);
  }
}