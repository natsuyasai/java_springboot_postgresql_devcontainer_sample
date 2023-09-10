package com.example.demo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash("Data")
public class RedisData {
  @Id
  private String id;
  private String name;
}
