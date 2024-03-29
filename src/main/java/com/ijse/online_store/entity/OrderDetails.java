package com.ijse.online_store.entity;

import java.io.Serializable;

import com.ijse.online_store.idClass.OrderDetailsId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_details")
@Getter
@Setter
@IdClass(OrderDetailsId.class)
public class OrderDetails implements Serializable {
  
  // @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  // private Long id;

  @Id
  @ManyToOne
  @JoinColumn(name = "order_id",nullable = false)
  private Orders order;

  @Id
  @ManyToOne
  @JoinColumn(name = "jersey_id")
  private Jersey jersey;

  @Column(nullable = false)
  private Integer quantity;

  @Column(nullable = false)
  private Double discount;
}
