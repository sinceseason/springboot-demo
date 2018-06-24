package com.example.demo.controller;

import com.example.demo.base.controller.BaseController;
import com.example.demo.base.define.Result;
import com.example.demo.model.Wharf;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WharfController extends BaseController {

    /*
    * 查询所有码头信息
    * */
    @GetMapping(value = "/wharf")
    public Result wharf() {
        Result result = new Result();
        List<Wharf> list = wharfService.findAll();
        return result.success(list);
    }
}
