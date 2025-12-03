package com.rohan.inventory_stock_system.model;

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
    @Column(nullable = false)
    private String movementType;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private String referenceType;
    private Long referenceId;
    @Column(nullable = false) @CreationTimestamp
    private LocalDateTime createdAt;
    private String reason;
}
