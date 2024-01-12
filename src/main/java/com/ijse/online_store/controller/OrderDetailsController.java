package com.ijse.online_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.online_store.entity.OrderDetails;
import com.ijse.online_store.idClass.OrderDetailsId;
import com.ijse.online_store.service.OrderDetailsService;

@RestController
public class OrderDetailsController {

  @Autowired
  OrderDetailsService orderDetailsService;

  @GetMapping("/order_details")
  public ResponseEntity<List<OrderDetails>> getAllOrderDetails() {

    try {
      return ResponseEntity.status(HttpStatus.OK).body(orderDetailsService.getAllOrderDetails());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

  }

  @GetMapping("order_details/{id}")
  public ResponseEntity<?> getOrderDetailsById(@PathVariable OrderDetailsId Id) {

    try {
      return ResponseEntity.status(HttpStatus.OK).body(orderDetailsService.getOrderDetalsById(Id));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order Details Not Found");
    }

  }

  @PutMapping("order_details/{id}")
  public ResponseEntity<?> updateOrderDetails(@PathVariable OrderDetailsId Id, @RequestBody OrderDetails orderDetails){

    OrderDetails updatedOrderdetails = orderDetailsService.updateOrderDetails(Id, orderDetails);

    if (updatedOrderdetails != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(updatedOrderdetails);
    }else{
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order details not updated");
    }

  }

}
