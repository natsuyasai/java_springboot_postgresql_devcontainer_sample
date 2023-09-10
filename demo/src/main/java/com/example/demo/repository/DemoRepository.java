package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DemoData;

@Repository
public interface  DemoRepository extends JpaRepository<DemoData, Long>{
  
}