package com.example.demo.controller;

import com.example.demo.base.controller.BaseController;
import com.example.demo.base.define.Definition;
import com.example.demo.base.define.Result;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

@RestController
public class SystemController extends BaseController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public Result login(String userName, String password) throws UnsupportedEncodingException{
        Result result = new Result();
        userName = URLDecoder.decode(userName.replaceAll("%", "%25"), StandardCharsets.UTF_8.toString());
        String passwordMd5 = DigestUtils.md5Hex(URLDecoder.decode(password.replaceAll("%", "%25"), "utf-8").getBytes());
        User loginUser = getLoginUser();
        if (loginUser != null && loginUser.getUserName().equals(userName) && loginUser.getPassword().equals(passwordMd5)) {
            return result.success(loginUser);
        }

        loginUser = userService.findByUserName(userName);
        if (loginUser == null)
            return result.error(null, Definition.NOUSER.getErrorCode(), Definition.NOUSER.getMsg());

        if (!loginUser.getPassword().equals(passwordMd5))
            return result.error(null, Definition.PWDERROR.getErrorCode(), Definition.PWDERROR.getMsg());

        request.getSession().setAttribute("loginUser", loginUser);
        return result.success(loginUser);
    }
}
