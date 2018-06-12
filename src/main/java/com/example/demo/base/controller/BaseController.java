package com.example.demo.base.controller;

import com.example.demo.base.define.DefinitionMap;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseController {
    @Autowired
    protected HttpServletRequest request;

    protected User getLoginUser() {
//        return DefinitionMap.loginedUserMap.get("loginUser");
        return (User) request.getSession().getAttribute("loginUser");
    }

}
