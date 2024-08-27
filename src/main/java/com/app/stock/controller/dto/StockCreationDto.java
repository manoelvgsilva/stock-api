package com.app.stock.controller.dto;

import com.app.stock.entity.Stock;
import java.util.Date;

/**
 * stockcreationdto.
 *
 * @param quantityPresent the quantitypresent
 * @param quantityMinimous the quantityminimous
 * @param quantityMaximous the quantitymaximous
 * @param dateVality the datevality
 */
public record StockCreationDto(
    Long quantityPresent,
    Long quantityMinimous,
    Long quantityMaximous,
    Date dateVality
) {

  /**
   * toentity.
   *
   * @return entity
   */
  public Stock toEntity() {
    return new Stock(quantityPresent, quantityMinimous, quantityMaximous,
        dateVality);
  }
}