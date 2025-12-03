package com.rohan.inventory_stock_system.service;

import com.rohan.inventory_stock_system.dao.ProductRepository;
import com.rohan.inventory_stock_system.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    /** 1. CREATE **/
    public Product save(Product product) {
        return productRepository.save(product);
    }

    /** 2. READ **/
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findByNameContaining(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Product> findByCategoryContainingIgnoreCase(String category) {
        return productRepository.findByCategoryContainingIgnoreCase(category);
    }

    public List<Product> findByBrandContainingIgnoreCase(String brand) {
        return productRepository.findByBrandContainingIgnoreCase(brand);
    }

    public List<Product> findByBrandContainingIgnoreCaseAndCategoryContainingIgnoreCase(String brand, String category) {
        return productRepository.findByBrandContainingIgnoreCaseAndCategoryContainingIgnoreCase(brand, category);
    }

    /** 3. UPDATE **/
    public Product update(Product product) {
        return productRepository.save(product);
    }

    /** 4. DELETE **/
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
