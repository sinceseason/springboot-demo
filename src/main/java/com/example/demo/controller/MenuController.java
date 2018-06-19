package com.example.demo.controller;

import com.example.demo.base.controller.BaseController;
import com.example.demo.base.define.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController extends BaseController {

    @GetMapping(value = "/menu")
    public Result menu() {

    }

}
