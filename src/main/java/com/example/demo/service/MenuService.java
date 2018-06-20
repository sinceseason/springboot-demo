package com.example.demo.service;

import com.example.demo.model.Menu;

import java.util.List;

public interface MenuService {

    /*
    * 根据类型查找菜单
    * @params type
    * */
    List<Menu> findByType(Integer type);
}
