package com.rohan.inventory_stock_system.dao;

import com.rohan.inventory_stock_system.model.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMovementRepository extends JpaRepository<StockMovement,Long> {
    // Add new methods if needed
}
