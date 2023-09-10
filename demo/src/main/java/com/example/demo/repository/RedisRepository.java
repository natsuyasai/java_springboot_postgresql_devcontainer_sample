package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.RedisData;

@Repository
public interface RedisRepository extends CrudRepository<RedisData, String> {

}
