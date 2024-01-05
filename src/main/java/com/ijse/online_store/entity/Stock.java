package com.ijse.online_store.entity;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Stock {

  @Id
  @OneToOne
  @JoinColumn(name = "jerseyId")
  private Jersey jersey;
  
  private Long quantity_S;
  
  private Long quantity_M;

  private Long quantity_L;

  private Long qunatity_XL;

  private Date lastUpdated;
}
