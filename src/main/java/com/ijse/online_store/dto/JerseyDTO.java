package com.ijse.online_store.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JerseyDTO {
  
  private String jerseyName;
  private String jerseyYear;
  private String jerseyTeam;
  private String jerseyDescription;
  private Double jerseyPrice;
  private Double jerseyDiscount;
  private Boolean isJerseyNew;
  private Long categoryId;
  private Integer quantity_S;
  private Integer quantity_M;
  private Integer quantity_L;
  private Integer quantity_XL;
  
}
