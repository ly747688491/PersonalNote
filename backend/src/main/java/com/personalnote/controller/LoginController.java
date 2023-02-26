package com.personalnote.controller;


import com.personalnote.domain.User;
import com.personalnote.result.ErrorCodeEnum;
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
        ErrorCodeEnum code = userService.login(user.getUsername(), user.getPassword());
        switch (code){
            case SUCCESS -> {
                return Result.success(ErrorCodeEnum.SUCCESS.getDescription());
            }
            case USER_ERROR_A0102 -> {
                return Result.error(ErrorCodeEnum.USER_ERROR_A0102.getDescription());
            }
            default -> {
                return Result.error(ErrorCodeEnum.USER_ERROR_A9999.getDescription());
            }
        }
    }
}
