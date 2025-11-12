package com.example.ModaMint_Backend.entity;

import com.example.ModaMint_Backend.entity.Product;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "brands")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    Long brandId;

    @Column(name = "brand_name")
    String brandName;

    String description;

    String logo;

    Boolean active;

    @OneToMany(mappedBy = "brand")
    @ToString.Exclude
    List<Product> products;
}
