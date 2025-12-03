package com.rohan.inventory_stock_system.controller;

import com.rohan.inventory_stock_system.model.Product;
import com.rohan.inventory_stock_system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    /** 1. CREATE **/
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        try {
            Product savedProduct = productService.save(product);
            return new ResponseEntity<>(savedProduct, CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(CONFLICT);
        }
    }

    /** 2. READ **/
    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll() {
        try {
            return new ResponseEntity<>(productService.findAll(), OK);
        } catch (Exception e) {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Optional<Product> optionalProduct = productService.findById(id);
        return optionalProduct.map(product -> new ResponseEntity<>(product, OK)).orElseGet(() -> new ResponseEntity<>(new Product(), NOT_FOUND));
    }

    @GetMapping(value = "/product", params = "name")
    public ResponseEntity<List<Product>> findByNameContaining(@RequestParam String name) {
        try {
            return new ResponseEntity<>(productService.findByNameContaining(name), OK);
        } catch (Exception e) {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }

    @GetMapping(value = "/product", params = "category")
    public ResponseEntity<List<Product>> findByCategoryContainingIgnoreCase(@RequestParam String category) {
        try {
            return new ResponseEntity<>(productService.findByCategoryContainingIgnoreCase(category), OK);
        } catch (Exception e) {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }

    @GetMapping(value = "/product", params = "brand")
    public ResponseEntity<List<Product>> findByBrandContainingIgnoreCase(@RequestParam String brand) {
        try {
            return new ResponseEntity<>(productService.findByBrandContainingIgnoreCase(brand), OK);
        } catch (Exception e) {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }

    @GetMapping(value = "/product", params = {"brand", "category"})
    public ResponseEntity<List<Product>> findByBrandContainingIgnoreCaseAndCategoryContainingIgnoreCase(@RequestParam String brand, @RequestParam String category) {
        try {
            return new ResponseEntity<>(productService.findByBrandContainingIgnoreCaseAndCategoryContainingIgnoreCase(brand, category), OK);
        } catch (Exception e) {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }

    /** 3. UPDATE **/
    @PutMapping(value = "/product")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        try {
            return new ResponseEntity<>(productService.update(product), OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Product(), NOT_FOUND);
        }
    }

    /** 4. DELETE **/
    @DeleteMapping(value = "/product")
    public ResponseEntity delete(@RequestBody Product product) {
        try {
            productService.delete(product);
            return new ResponseEntity<>(OK);
        } catch (Exception e) {
            return new ResponseEntity<>(NOT_FOUND);
        }
    }
}
