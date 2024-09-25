package com.app.stock.entity;

import jakarta.persistence.Id;
import java.util.Date;
import java.util.Objects;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * stock.
 */
@Document(collection = "stocks")
public class Stock {

  @Id
  private Long productId;
  private Long quantityPresent;
  private Long quantityMinimous;
  private Long quantityMaximous;
  private Date dateCreation;
  private Date dateValidity;
  private String localPresent;
  private boolean statusProduct;

  public Stock() {}

  /**
   * stock.
   *
   * @param productId the productid
   * @param quantityPresent the quantitypresent
   * @param quantityMinimous the quantityminimous
   * @param quantityMaximous the quantitymaximous
   * @param dateCreation the datecreation
   * @param dateValidity the datevality
   * @param localPresent the localpresent
   * @param statusProduct the statusproduct
   */
  public Stock(
      Long productId,
      Long quantityPresent,
      Long quantityMinimous,
      Long quantityMaximous,
      Date dateCreation,
      Date dateValidity,
      String localPresent,
      boolean statusProduct
  ) {
    this.productId = productId;
    this.quantityPresent = quantityPresent;
    this.quantityMinimous = quantityMinimous;
    this.quantityMaximous = quantityMaximous;
    this.dateCreation = dateCreation;
    this.dateValidity = dateValidity;
    this.localPresent = localPresent;
    this.statusProduct = statusProduct;
  }

  public Stock(
      Long quantityPresent,
      Long quantityMinimous,
      Long quantityMaximous,
      Date dateCreation,
      Date dateVality
  ) {
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Long getQuantityPresent() {
    return quantityPresent;
  }

  public void setQuantityPresent(Long quantityPresent) {
    this.quantityPresent = quantityPresent;
  }

  public Long getQuantityMinimous() {
    return quantityMinimous;
  }

  public void setQuantityMinimous(Long quantityMinimous) {
    this.quantityMinimous = quantityMinimous;
  }

  public Long getQuantityMaximous() {
    return quantityMaximous;
  }

  public void setQuantityMaximous(Long quantityMaximous) {
    this.quantityMaximous = quantityMaximous;
  }

  public Date getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  public Date getDateValidity() {
    return dateValidity;
  }

  public void setDateValidity(Date dateValidity) {
    this.dateValidity = dateValidity;
  }

  public String getLocalPresent() {
    return localPresent;
  }

  public void setLocalPresent(String localPresent) {
    this.localPresent = localPresent;
  }

  public boolean isStatusProduct() {
    return statusProduct;
  }

  public void setStatusProduct(boolean statusProduct) {
    this.statusProduct = statusProduct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stock stock = (Stock) o;
    return Objects.equals(productId, stock.productId)
        && Objects.equals(quantityPresent, stock.quantityPresent)
        && Objects.equals(quantityMinimous, stock.quantityMinimous)
        && Objects.equals(quantityMaximous, stock.quantityMaximous)
        && Objects.equals(dateCreation, stock.dateCreation)
        && Objects.equals(dateValidity, stock.dateValidity)
        && Objects.equals(localPresent, stock.localPresent)
        && Objects.equals(statusProduct, stock.statusProduct);
  }
}