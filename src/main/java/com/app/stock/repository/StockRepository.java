package com.app.stock.repository;

import com.app.stock.entity.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends MongoRepository<Stock, Long> {
  Optional<Stock> findById(Long productId);
}
