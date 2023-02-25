package com.personalnote.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.User;
import com.personalnote.result.Result;
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
    public void register(User user) {
        userMapper.insert(user);
    }


}




