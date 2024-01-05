package com.ijse.online_store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long employeeId;

  @Column(unique = true)
  private String employeeUserName;

  @Column(unique = true)
  private String employeeEmail;

  @Column(nullable = false)
  private String employeePassword;

  @Column(nullable = false)
  private String employeeRole;

}
