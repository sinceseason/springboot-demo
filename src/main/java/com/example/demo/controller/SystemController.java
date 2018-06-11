package com.example.demo.controller;

import com.example.demo.base.controller.BaseController;
import com.example.demo.base.define.Definition;
import com.example.demo.base.define.Result;
import com.example.demo.dto.UserParams;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class SystemController extends BaseController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public Result login(String userName, String password) throws UnsupportedEncodingException {
        Result result = new Result();
        userName = URLDecoder.decode(userName, "utf-8");
        String passwordMd5 = Md5Crypt.apr1Crypt(URLDecoder.decode(password.replaceAll("%", "%25"), "utf-8").getBytes());
        User loginUser = getLoginUser();
        if (loginUser != null && loginUser.getUserName().equals(userName) && loginUser.getPassword().equals(passwordMd5)) {
            return result.success(loginUser);
        }

        loginUser = userService.findByUserNameAndPassword(userName, passwordMd5);
        if (loginUser == null)
            return result.error(null, Definition.NOUSER.getErrorCode(), Definition.NOUSER.getMsg());

        if (!loginUser.getPassword().equals(passwordMd5))
            return result.error(null, Definition.PWDERROR.getErrorCode(), Definition.PWDERROR.getMsg());

        request.getSession().setAttribute("loginUser", loginUser);
        return result.success(loginUser);
    }
}
