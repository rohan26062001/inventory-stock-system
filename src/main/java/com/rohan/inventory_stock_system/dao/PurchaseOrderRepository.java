package com.rohan.inventory_stock_system.dao;

import com.rohan.inventory_stock_system.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    // Add new methods if needed
}
