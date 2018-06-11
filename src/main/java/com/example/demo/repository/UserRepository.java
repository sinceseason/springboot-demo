package com.example.demo.repository;

import com.example.demo.base.respository.BaseRespository;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRespository<User, Integer> {

    User findByUserNameAndPassword(String userName, String password);
}
