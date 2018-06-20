package com.example.demo.controller;

import com.example.demo.base.controller.BaseController;
import com.example.demo.base.define.Result;
import com.example.demo.model.Menu;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController extends BaseController {

    /*
    * 根据登录人员类型加载菜单
    * @params type
    * */
    @GetMapping(value = "/menu/{type}")
    public Result menu(@PathVariable Integer type) {
        Result result = new Result();
        User user = getLoginUser();
        List<Menu> list = menuService.findByType(type);
        return result.success(list);
    }

}
