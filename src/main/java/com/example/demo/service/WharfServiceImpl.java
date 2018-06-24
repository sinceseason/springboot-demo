package com.example.demo.service;

import com.example.demo.model.Wharf;
import com.example.demo.repository.WharfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WharfServiceImpl implements WharfService {
    @Autowired
    private WharfRepository wharfRepository;

    @Override
    public List<Wharf> findAll() {
        return wharfRepository.findAll();
    }
}
