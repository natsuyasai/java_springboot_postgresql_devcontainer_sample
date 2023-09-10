package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="demodata", schema = "data")
@Entity
public class DemoData {
  
  @Id
  @GeneratedValue
  private Long id;
  
  private String data;
}
