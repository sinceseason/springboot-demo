package com.example.demo.repository;

import com.example.demo.base.respository.BaseRespository;
import com.example.demo.model.Wharf;
import org.springframework.stereotype.Repository;

@Repository
public interface WharfRepository extends BaseRespository<Wharf, Integer> {
}
