package com.personalnote.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.User;
import com.personalnote.service.UserService;
import com.personalnote.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【user(用户表信息)】的数据库操作Service实现
* @createDate 2023-02-18 16:42:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean login(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        wrapper.eq("password", password);
        return this.count(wrapper) > 0;
    }

    @Override
    public String signup(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        if (this.count(wrapper) > 0){
            return "该用户已存在";
        }
        else if ("".equals(user.getUsername()) || "".equals(user.getPassword())){
            return "用户名或密码为空";
        }
        else if (userMapper.insert(user) == 1){
            return "注册成功，请返回登录界面";
        }
        else {
            return "发生了未知错误，请退出重试";
        }

    }
}




