package com.personalnote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.personalnote.domain.User;
import com.personalnote.result.ErrorCodeEnum;

/**
* @author LY
* @description 针对表【user(用户表信息)】的数据库操作Service
* @createDate 2023-02-18 16:42:14
*/
public interface UserService extends IService<User> {

     ErrorCodeEnum login(String username, String password);

     ErrorCodeEnum signup(User user);


}
