package com.ijse.online_store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Customer;

@Service
public interface CustomerService {
  List<Customer> getAllCustomers();

  Customer createCustomer(Customer customer);

  Customer getCustomerByID(Long id);

  Customer updateCustomer(Long id, Customer customer);

  void deleteCustomer(Long id);
}
