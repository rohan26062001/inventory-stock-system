package com.rohan.inventory_stock_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(nullable = false)
    private PurchaseOrder purchaseOrder;
    @ManyToOne @JoinColumn(nullable = false)
    private Product product;
    @Column(nullable = false)
    private int orderedQty;
    @Column(nullable = false)
    private int receivedQty;
    @Column(nullable = false)
    private BigDecimal unitPrice;
}
