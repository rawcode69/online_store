package com.ijse.online_store.entity;

import java.util.List;

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
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Jersey {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long jerseyId;
  
  @Column(unique = true,nullable = false)
  private String jerseyName;


  private String jerseyYear;

  @Column(unique = true)
  private String jerseyTeam;

  @Column(nullable = false)
  private String jerseyDescription;

  @Column(nullable = false)
  private Double jerseyPrice;

  private Double jerseyDiscount;

  @Column(nullable = false)
  private Boolean isJerseyNew;

  @ManyToOne
  @JoinColumn(name = "categoryId")
  Category category;

  @OneToOne(mappedBy = "jersey", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  Stock stock;

  @ManyToMany(mappedBy = "jerseys",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private List<Orders>orders;

}
