package com.ijse.online_store.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Customer;
import com.ijse.online_store.repository.CustomerRepository;
import com.ijse.online_store.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  @Override
  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public Customer getCustomerByID(Long id) {
    return customerRepository.findById(id).orElse(null);
  }

  @Override
  public Customer updateCustomer(Long id, Customer customer) {

    Customer exsitingCustomer = customerRepository.findById(id).orElse(null);

    if (exsitingCustomer != null) {
      
      exsitingCustomer.setCustUserName(customer.getCustUserName());
      exsitingCustomer.setCustPassword(customer.getCustPassword());
      exsitingCustomer.setCustAddress(customer.getCustAddress());

      return customerRepository.save(exsitingCustomer);
    }else{
      return null;
    }

  }

  @Override
  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }


  
}
