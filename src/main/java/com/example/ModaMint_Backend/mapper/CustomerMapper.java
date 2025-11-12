package com.example.ModaMint_Backend.mapper;

import com.example.ModaMint_Backend.dto.request.customer.CustomerRequest;
import com.example.ModaMint_Backend.dto.response.customer.CustomerResponse;
import com.example.ModaMint_Backend.entity.Customer;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CustomerMapper {
    Customer toCustomer(CustomerRequest request);

    CustomerResponse toCustomerResponse(Customer customer);

    void toCustomer(CustomerRequest request, @MappingTarget Customer customer);
}
