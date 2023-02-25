package com.personalnote.controller;

import com.personalnote.domain.User;
import com.personalnote.result.Result;
import com.personalnote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @date 2023/2/21 20:22
 * @description RegisterController
 */
@RestController
@RequestMapping("/api")
public class RegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public Result<String> signup(@RequestBody User user) {
        String msg = userService.signup(user);
        if (msg != null) {
            if (msg.equals("注册成功，请返回登录界面")) {
                return Result.success(msg);
            }
            else {
                return Result.error(msg);
            }
        }
        else {
            return Result.error("发生了未知错误，请退出重试");
        }
    }
}
