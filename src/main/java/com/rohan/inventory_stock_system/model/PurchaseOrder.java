package com.rohan.inventory_stock_system.model;

import com.rohan.inventory_stock_system.model.enums.PurchaseOrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(nullable = false)
    private Supplier supplier;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private PurchaseOrderStatus status;
    private LocalDate expectedDate;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
