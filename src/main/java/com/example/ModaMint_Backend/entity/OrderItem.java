package com.example.ModaMint_Backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "order_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(OrderItem.OrderItemId.class)
public class OrderItem {
    @Id
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    @Id
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "product_variant_id")
    ProductVariant productVariant;

    @Column(name = "unit_price", nullable = false)
    Double unitPrice;

    @Column(nullable = false)
    Long quantity;

    public Double getLineTotal() {
        return unitPrice * quantity;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class OrderItemId {
        Order order;
        ProductVariant productVariant;
    }

}
