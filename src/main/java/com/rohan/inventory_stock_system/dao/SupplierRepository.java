package com.rohan.inventory_stock_system.dao;

import com.rohan.inventory_stock_system.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // Add new methods if needed
}
