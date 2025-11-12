package com.example.ModaMint_Backend.entity.compositeKey;

import com.example.ModaMint_Backend.entity.Order;
import com.example.ModaMint_Backend.entity.ProductVariant;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderItemId {
    Order order;
    ProductVariant productVariant;
}
