package com.example.demo.service;

import com.example.demo.model.Wharf;

import java.util.List;

public interface WharfService {

    /*
    * 查找所有码头
    * */
    List<Wharf> findAll();
}
