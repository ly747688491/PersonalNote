package com.personalnote.controller;


import com.personalnote.domain.User;
import com.personalnote.result.Result;
import com.personalnote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<String> login(@RequestBody User user) {
        boolean code = userService.login(user.getUsername(), user.getPassword());
        if (code) {
            return Result.success("登录成功");
        } else {
            return Result.error("登录失败");
        }
    }
}
