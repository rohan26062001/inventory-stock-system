package com.rohan.inventory_stock_system.dao;

import com.rohan.inventory_stock_system.model.PurchaseOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderItemRepository extends JpaRepository<PurchaseOrderItem, Long> {
    // Add new methods if needed
}
