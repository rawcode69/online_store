package com.ijse.online_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.online_store.entity.OrderDetails;
import com.ijse.online_store.idClass.OrderDetailsId;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsId>{
  
  //Add Custom Reposritory here

}
