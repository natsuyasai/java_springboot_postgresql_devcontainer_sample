package com.example.demo.contoroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RedisData;
import com.example.demo.repository.RedisRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/redis")
public class RedisController {
  private final RedisRepository redisRepository;

  @PostMapping("/save")
  public void saveData(@RequestBody RedisData data) {
    redisRepository.save(data);
  }

  @GetMapping("/{id}")
  public RedisData getData(@PathVariable String id) {
    return redisRepository.findById(id).orElse(null);
  }

  @GetMapping("/")
  public Iterable<RedisData> getAllData() {
    return redisRepository.findAll();
  }
}
