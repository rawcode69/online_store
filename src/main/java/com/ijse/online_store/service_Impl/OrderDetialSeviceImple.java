package com.ijse.online_store.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.OrderDetails;
import com.ijse.online_store.idClass.OrderDetailsId;
import com.ijse.online_store.repository.OrderDetailsRepository;
import com.ijse.online_store.service.OrderDetailsService;

@Service
public class OrderDetialSeviceImple implements OrderDetailsService {

  @Autowired
  OrderDetailsRepository orderDetailsRepository;

  @Override
  public List<OrderDetails> getAllOrderDetails() {
    return orderDetailsRepository.findAll();
  }

  @Override
  public OrderDetails getOrderDetalsById(OrderDetailsId Id) {
    return orderDetailsRepository.findById(Id).orElse(null);
  }

  @Override
  public OrderDetails createOrderDetails(OrderDetails orderDetails) {
    return orderDetailsRepository.save(orderDetails);
  }

  @Override
  public OrderDetails updateOrderDetails(OrderDetailsId Id, OrderDetails orderDetails) {
    
    OrderDetails exsistingOrderDetials = orderDetailsRepository.findById(Id).orElse(null);

    if (exsistingOrderDetials != null) {
      
      exsistingOrderDetials.setDiscount(orderDetails.getDiscount());
      exsistingOrderDetials.setJersey(orderDetails.getJersey());
      exsistingOrderDetials.setQuantity(orderDetails.getQuantity());
      exsistingOrderDetials.setOrder(orderDetails.getOrder());

      return orderDetailsRepository.save(exsistingOrderDetials);

    }else{

      return null;

    }

  }
  
}
