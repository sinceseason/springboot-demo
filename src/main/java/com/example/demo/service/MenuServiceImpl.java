package com.example.demo.service;

import com.example.demo.dto.MenuParams;
import com.example.demo.model.Menu;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> findByType(Integer type) {
        List<Menu> list = menuRepository.findByType(type);
        List ls = new ArrayList();
        list.forEach(item -> {
            if (item.getParentId().equals(0)) {
                ls.add(item);
                setSubMenu(item, list);
            }
        });
        return ls;
    }

    private void setSubMenu(Menu parentMenu, List<Menu> menuList) {
        menuList.forEach(menu -> {
            if (menu.getParentId().equals(parentMenu.getId())) {
                parentMenu.getSubMenu().add(menu);
                setSubMenu(menu, menuList);
            }
        });
    }
}
