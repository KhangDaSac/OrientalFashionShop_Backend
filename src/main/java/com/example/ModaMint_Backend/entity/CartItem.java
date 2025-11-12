package com.example.ModaMint_Backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "cart_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(CartItem.CartItemId.class)
public class CartItem {
    @Id
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "cart_id")
    Cart cart;

    @Id
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "product_variant_id")
    ProductVariant productVariant;

    Long quantity;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class CartItemId {
        Cart cart;
        ProductVariant productVariant;
    }
}
