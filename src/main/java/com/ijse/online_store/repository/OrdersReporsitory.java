package com.ijse.online_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.online_store.entity.Orders;

@Repository
public interface OrdersReporsitory extends JpaRepository<Orders, Long> {

  //Add custom queries here...

}
