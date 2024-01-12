package com.ijse.online_store.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Jersey {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long jerseyId;
  
  @Column(unique = true,nullable = false)
  private String jerseyName;


  private String jerseyYear;

  @Column(nullable = false)
  private String jerseyTeam;

  @Column(nullable = false)
  private String jerseyDescription;

  @Column(nullable = false)
  private Double jerseyPrice;

  private Double jerseyDiscount;

  @Column(nullable = false)
  private Boolean isJerseyNew;

  @Column(nullable = false)
  private Integer quantity_S;

  @Column(nullable = false)
  private Integer quantity_M;

  @Column(nullable = false)
  private Integer quantity_L;

  @Column(nullable = false)
  private Integer quantity_XL;

  private Date lastUpdated;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "categoryId",nullable = false)
  Category category;

  @ManyToMany(mappedBy = "jerseys",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private List<Orders>orders;

}
