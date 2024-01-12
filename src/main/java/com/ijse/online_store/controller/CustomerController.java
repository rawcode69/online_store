package com.ijse.online_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.online_store.entity.Customer;
import com.ijse.online_store.service.CustomerService;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping("/customers")
  public ResponseEntity<List<Customer>> getAllCustomers() {

    try {
      return ResponseEntity.status(HttpStatus.OK).body(customerService.getAllCustomers());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

  }

  @GetMapping("/customers/{id}")
  public ResponseEntity<?> getCustomerById(@PathVariable Long Id) {

    Customer customer = customerService.getCustomerByID(Id);

    if (customer != null) {
      return ResponseEntity.status(HttpStatus.OK).body(customer);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer Not Found");
    }

  }

  @PostMapping("/customers")
  public ResponseEntity<?> createCustomer(@RequestBody Customer customer) {

    try {
      return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customer));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Customer Not Created");
    }

  }

  @PutMapping("/customers/{id}")
  public ResponseEntity<?> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {

    Customer newCustomer = customerService.updateCustomer(id, customer);

    if (newCustomer != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(newCustomer);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Customer Not Updated");
    }

  }

  @DeleteMapping("/customers/{id}")
  public ResponseEntity<?> deeletCustomer(@PathVariable Long id) {

    try {
      Customer customer = customerService.getCustomerByID(id);

      if (customer != null) {
        customerService.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).body("Customer Deleted Succuessfully");
      } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer Not Found");
      }
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting Customer");
    }

  }

}
