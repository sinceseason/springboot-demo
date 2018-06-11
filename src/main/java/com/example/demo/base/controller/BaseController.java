package com.example.demo.base.controller;

import com.example.demo.base.define.DefinitionMap;
import com.example.demo.model.User;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    protected HttpServletRequest request;

    protected User getLoginUser() {
//        return DefinitionMap.loginedUserMap.get("loginUser");
        return (User) request.getSession().getAttribute("loginUser");
    }

}
