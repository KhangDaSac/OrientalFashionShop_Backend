package com.example.ModaMint_Backend.entity;

import com.example.ModaMint_Backend.entity.Address;
import com.example.ModaMint_Backend.entity.Cart;
import com.example.ModaMint_Backend.entity.Order;
import com.example.ModaMint_Backend.entity.Review;
import com.example.ModaMint_Backend.entity.User;
import com.example.ModaMint_Backend.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    @Id
    @Column(name = "customer_id")
    Long customerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    User user;

    @ElementCollection
    @CollectionTable(
            name = "customer_addresses",
            joinColumns = @JoinColumn(name = "customer_id")
    )
    List<Address> addresses;

    @OneToOne(mappedBy = "customer")
    Cart cart;

    @OneToMany(mappedBy = "customer")
    @ToString.Exclude
    List<Order> orders;

    @OneToMany(mappedBy = "customer")
    @ToString.Exclude
    List<Review> reviews;
}