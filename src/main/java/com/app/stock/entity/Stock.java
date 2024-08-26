package com.app.stock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Objects;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * stock.
 */
@Entity
@Table(name = "stocks")
@EntityListeners(AuditingEntityListener.class)
public class Stock {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true)
  private Long productId;
  private Long quantityPresent;
  private Long quantityMinimous;
  private Long quantityMaximous;
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
   * @param dateValidity the datevality
   * @param localPresent the localpresent
   * @param statusProduct the statusproduct
   */
  public Stock(
      Long productId,
      Long quantityPresent,
      Long quantityMinimous,
      Long quantityMaximous,
      Date dateValidity,
      String localPresent,
      boolean statusProduct
  ) {
    this.productId = productId;
    this.quantityPresent = quantityPresent;
    this.quantityMinimous = quantityMinimous;
    this.quantityMaximous = quantityMaximous;
    this.dateValidity = dateValidity;
    this.localPresent = localPresent;
    this.statusProduct = statusProduct;
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
        && Objects.equals(dateValidity, stock.dateValidity)
        && Objects.equals(localPresent, stock.localPresent)
        && Objects.equals(statusProduct, stock.statusProduct);
  }
}
