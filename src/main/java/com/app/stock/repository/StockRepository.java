package com.app.stock.repository;

import com.app.stock.entity.Stock;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * stockrepository.
 */
@Repository
public interface StockRepository extends MongoRepository<Stock, String> {
  Optional<Stock> findByProductId(String productId);
}