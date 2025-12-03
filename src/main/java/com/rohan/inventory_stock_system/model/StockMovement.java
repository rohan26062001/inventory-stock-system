package com.rohan.inventory_stock_system.model;

import com.rohan.inventory_stock_system.model.enums.StockMovementReferenceType;
import com.rohan.inventory_stock_system.model.enums.StockMovementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StockMovement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(nullable = false)
    private Product product;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private StockMovementType movementType;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private StockMovementReferenceType referenceType;
    private Long referenceId;
    @Column(nullable = false) @CreationTimestamp
    private LocalDateTime createdAt;
    private String reason;
}
