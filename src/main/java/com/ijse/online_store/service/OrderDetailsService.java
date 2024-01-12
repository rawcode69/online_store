package com.ijse.online_store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.OrderDetails;
import com.ijse.online_store.idClass.OrderDetailsId;

@Service
public interface OrderDetailsService {

  List<OrderDetails> getAllOrderDetails();

  OrderDetails getOrderDetalsById(OrderDetailsId Id);

  OrderDetails createOrderDetails(OrderDetails orderDetails);

  OrderDetails updateOrderDetails(OrderDetailsId Id, OrderDetails orderDetails);

  //Add function for delete orderDetails...
}
