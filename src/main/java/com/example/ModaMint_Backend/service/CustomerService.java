package com.example.ModaMint_Backend.service;

import com.example.ModaMint_Backend.dto.response.customer.CustomerResponse;
import com.example.ModaMint_Backend.entity.Cart;
import com.example.ModaMint_Backend.entity.Customer;
import com.example.ModaMint_Backend.entity.User;
import com.example.ModaMint_Backend.exception.AppException;
import com.example.ModaMint_Backend.exception.ErrorCode;
import com.example.ModaMint_Backend.mapper.CustomerMapper;
import com.example.ModaMint_Backend.repository.CartRepository;
import com.example.ModaMint_Backend.repository.CustomerRepository;
import com.example.ModaMint_Backend.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerService {

    CustomerRepository customerRepository;
    CartRepository cartRepository;
    UserRepository userRepository;
    CustomerMapper customerMapper;

//    public void create(CustomerRegisterRequest request) {
//        if(userRepository.existsByUsername(request.getUsername()))
//            throw new AppException(ErrorCode.CUSTOMER_ALREADY_EXISTS);
//
//        Cart cart = cartRepository.save(Cart.builder().build());
//
//        User user = User.builder().build();
//
//
//
//        Customer customer = Customer.builder()
//                .cart(cart)
//                .build();
//
//        Customer savedCustomer = customerRepository.save(customer);
//        log.info("Customer created successfully with customerId: {}", savedCustomer.getCustomerId());
//
//        return customerMapper.toCustomerResponse(savedCustomer);
//    }

//    @Transactional(readOnly = true)
//    public CustomerResponse getCustomerById(String customerId) {
//        log.info("Getting customer by customerId: {}", customerId);
//
//        Customer customer = customerRepository.findByCustomerIdWithUser(customerId)
//                .orElseThrow(() -> new AppException(ErrorCode.CUSTOMER_NOT_FOUND));
//
//        return customerMapper.toCustomerResponse(customer);
//    }
//
//    @Transactional(readOnly = true)
//    public List<CustomerResponse> getAllCustomers() {
//        log.info("Getting all customers");
//
//        List<Customer> customers = customerRepository.findAllWithUser();
//        return customers.stream()
//                .map(customerMapper::toCustomerResponse)
//                .collect(Collectors.toList());
//    }
//
//    @Transactional(readOnly = true)
//    public List<CustomerResponse> getAllActiveCustomers() {
//        log.info("Getting all active customers");
//
//        List<Customer> customers = customerRepository.findAllActiveCustomers();
//        return customers.stream()
//                .map(customerMapper::toCustomerResponse)
//                .collect(Collectors.toList());
//    }
//
//    public CustomerResponse updateCustomer(String customerId, CustomerRegisterRequest request) {
//        log.info("Updating customer with customerId: {}", customerId);
//
//        Customer customer = customerRepository.findByCustomerIdWithUser(customerId)
//                .orElseThrow(() -> new AppException(ErrorCode.CUSTOMER_NOT_FOUND));
//
//        // Check if new customerId exists (must exist as a User)
//        User user = userRepository.findById(request.getCustomerId())
//                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_FOUND));
//
//        // Check if new customerId is already used by another customer
//        if (!customerId.equals(request.getCustomerId()) && customerRepository.existsByCustomerId(request.getCustomerId())) {
//            throw new AppException(ErrorCode.CUSTOMER_ALREADY_EXISTS);
//        }
//
//        customer.setCustomerId(request.getCustomerId());
//        customer.setUser(user);
//
//        Customer updatedCustomer = customerRepository.save(customer);
//        log.info("Customer updated successfully with customerId: {}", updatedCustomer.getCustomerId());
//
//        return customerMapper.toCustomerResponse(updatedCustomer);
//    }
//
//    public void deleteCustomer(String customerId) {
//        log.info("Deleting customer with customerId: {}", customerId);
//
//        Customer customer = customerRepository.findByCustomerIdWithUser(customerId)
//                .orElseThrow(() -> new AppException(ErrorCode.CUSTOMER_NOT_FOUND));
//
//        customerRepository.delete(customer);
//        log.info("Customer deleted successfully with customerId: {}", customerId);
//    }
}
