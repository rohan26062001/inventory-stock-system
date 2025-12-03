package com.rohan.inventory_stock_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long purchaseOrderId;
    @Column(nullable = false)
    private Long productId;
    @Column(nullable = false)
    private int orderedQty;
    @Column(nullable = false)
    private int receivedQty;
    @Column(nullable = false)
    private BigDecimal unitPrice;
}
