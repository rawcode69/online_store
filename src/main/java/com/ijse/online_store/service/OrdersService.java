package com.ijse.online_store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Orders;

@Service
public interface OrdersService {

  List<Orders> getAllOrders();

  Orders getOrderById(Long Id);

  Orders createOrder(Orders orders);

}
