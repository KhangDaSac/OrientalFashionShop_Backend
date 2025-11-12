package com.example.ModaMint_Backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "product_variants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductVariant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_variant_id")
    Long productVariantId;

    @Column(name = "product_variant_name")
    String productVariantName;

    String size;

    String color;

    @ElementCollection
    @CollectionTable(
            name = "product_variant_images",
            joinColumns = @JoinColumn(name = "product_variant_id")
    )
    List<String> images;

    Double price;

    Double discount;

    @Column(name = "inventory_quantity")
    Long inventoryQuantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    public Double getSalePrice() {
        if (discount != null && discount > 0) {
            return price - (price * discount / 100);
        }
        return price;
    }
}
