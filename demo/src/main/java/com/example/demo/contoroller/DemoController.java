package com.example.demo.contoroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoData;
import com.example.demo.repository.DemoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("")
public class DemoController {

  private final DemoRepository repository;

  @GetMapping("/")
  public List<DemoData> getData() {
    return repository.findAll();
  }

}
