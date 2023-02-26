package com.personalnote.controller;

import com.personalnote.domain.Folder;
import com.personalnote.domain.User;
import com.personalnote.result.ErrorCodeEnum;
import com.personalnote.result.Result;
import com.personalnote.service.FolderService;
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
public class SignupController {
    @Autowired
    private UserService userService;
    @Autowired
    private FolderService folderService;

    @PostMapping("/signup")
    public Result<String> signup(@RequestBody User user) {
        ErrorCodeEnum msg = userService.signup(user);
        switch (msg){
            case SUCCESS -> {

                return Result.success(ErrorCodeEnum.SUCCESS.getDescription());
            }
            case USER_ERROR_A0100 -> {
                return Result.error(ErrorCodeEnum.USER_ERROR_A0100.getDescription());
            }
            case USER_ERROR_A0101 -> {
                return Result.error(ErrorCodeEnum.USER_ERROR_A0101.getDescription());
            }
            default -> {
                return Result.error(ErrorCodeEnum.USER_ERROR_A9999.getDescription());
            }
        }
    }
}
