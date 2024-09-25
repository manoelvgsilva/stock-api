package com.app.stock.controller.dto;

import com.app.stock.entity.Stock;
import java.util.Date;

/**
 * stockcreationdto.
 *
 * @param productId the productid
 * @param quantityPresent the quantitypresent
 * @param quantityMinimous the quantityminimous
 * @param quantityMaximous the quantitymaximous
 * @param dateCreation the datecreation
 * @param dateVality the datevality
 * @param localPresent the localpresent
 * @param statusProduct the statusproduct
 */
public record StockCreationDto(
    String productId,
    Long quantityPresent,
    Long quantityMinimous,
    Long quantityMaximous,
    Date dateCreation,
    Date dateVality,
    String localPresent,
    Boolean statusProduct
) {

  /**
   * toentity.
   *
   * @return entity
   */
  public Stock toEntity() {
    return new Stock(productId, quantityPresent, quantityMinimous,
        quantityMaximous,
        dateCreation,
        dateVality, localPresent, statusProduct);
  }
}