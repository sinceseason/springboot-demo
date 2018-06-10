package com.example.demo.controller;

import com.example.demo.base.define.Result;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class SystemController {

    @GetMapping(value = "/login")
    public Result login(String userName, String password) throws UnsupportedEncodingException {
        userName = URLDecoder.decode(userName, "utf-8");
        password = Md5Crypt.apr1Crypt(URLDecoder.decode(password.replaceAll("%", "%25"), "utf-8").getBytes());
        return Result.success();
    }
}
