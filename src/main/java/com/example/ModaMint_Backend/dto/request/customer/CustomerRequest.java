package com.example.ModaMint_Backend.dto.request.customer;

import com.example.ModaMint_Backend.entity.Address;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CustomerRequest {
    List<Address> addresses;
}
