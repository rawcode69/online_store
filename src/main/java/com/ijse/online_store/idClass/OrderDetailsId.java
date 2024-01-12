package com.ijse.online_store.idClass;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailsId implements Serializable {
  private Long order;
  private Long jersey;
}
