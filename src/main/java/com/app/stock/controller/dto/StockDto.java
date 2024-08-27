package com.app.stock.controller.dto;

import com.app.stock.entity.Stock;
import java.util.Date;

/**
 * stockdto.
 *
 * @param productId the productid
 * @param quantityPresent the quantitypresent
 * @param quantityMinimous the quantityminimous
 * @param quantityMaximous the quantitymaximous
 * @param dateVality the datevality
 * @param localPresent the localpresent
 * @param statusProduct the statusproduct
 */
public record StockDto(
    Long productId,
    Long quantityPresent,
    Long quantityMinimous,
    Long quantityMaximous,
    Date dateVality,
    String localPresent,
    Boolean statusProduct
) {

  /**
   * fromentity.
   *
   * @param stock the stock
   * @return stock
   */
  public static StockDto fromEntity(Stock stock) {
    return new StockDto(
        stock.getProductId(),
        stock.getQuantityPresent(),
        stock.getQuantityMinimous(),
        stock.getQuantityMaximous(),
        stock.getDateValidity(),
        stock.getLocalPresent(),
        stock.isStatusProduct()
    );
  }
}