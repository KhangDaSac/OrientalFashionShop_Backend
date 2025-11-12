package com.example.ModaMint_Backend.entity;

import com.example.ModaMint_Backend.entity.Order;
import com.example.ModaMint_Backend.entity.ProductVariant;
import com.example.ModaMint_Backend.entity.compositeKey.OrderItemId;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(OrderItemId.class)
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
}
