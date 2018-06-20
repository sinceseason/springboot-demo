package com.example.demo.repository;

import com.example.demo.base.respository.BaseRespository;
import com.example.demo.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends BaseRespository<Menu, Integer> {

    List<Menu> findByType(Integer type);
}
