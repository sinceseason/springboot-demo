package com.example.demo.controller;

import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.provider.MD5;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class SystemController {

    @GetMapping(value = "/login")
    public String login(String userName, String password) throws UnsupportedEncodingException {
        userName = URLDecoder.decode(userName, "utf-8");
        password = Md5Crypt.apr1Crypt(URLDecoder.decode(password.replaceAll("%", "%25"), "utf-8").getBytes());
        return userName + " / " + password;
    }
}
