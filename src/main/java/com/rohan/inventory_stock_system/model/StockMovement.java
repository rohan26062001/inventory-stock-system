package com.rohan.inventory_stock_system.model;

import com.rohan.inventory_stock_system.model.enums.StockMovementReferenceType;
import com.rohan.inventory_stock_system.model.enums.StockMovementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StockMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long productId;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StockMovementType movementType;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StockMovementReferenceType referenceType;
    private Long referenceId;
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    private String reason;
}
