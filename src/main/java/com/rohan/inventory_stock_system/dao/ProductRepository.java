package com.rohan.inventory_stock_system.dao;

import com.rohan.inventory_stock_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByNameContainingIgnoreCase(String name);
    public List<Product> findByCategoryContainingIgnoreCase(String category);
    public List<Product> findByBrandContainingIgnoreCase(String brand);
    public List<Product> findByBrandContainingIgnoreCaseAndCategoryContainingIgnoreCase(String brand, String category);
}
