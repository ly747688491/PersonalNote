package com.personalnote.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Folder;
import com.personalnote.domain.User;
import com.personalnote.result.ErrorCodeEnum;
import com.personalnote.service.UserService;
import com.personalnote.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private FolderServiceImpl folderService;
    @Override
    public ErrorCodeEnum login(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        wrapper.eq("password", password);
        if(this.count(wrapper) > 0){
            return ErrorCodeEnum.SUCCESS;
        }
        else if (this.count(wrapper) <=0) {
            return ErrorCodeEnum.USER_ERROR_A0102;
        }
        else {
            return ErrorCodeEnum.USER_ERROR_A9999;
        }
    }
    @Override
    @Transactional
    public ErrorCodeEnum signup(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        if (this.count(wrapper) > 0){
            return ErrorCodeEnum.USER_ERROR_A0100;
//            A0100表示用户名已存在需要
        }
        else if ("".equals(user.getUsername()) || "".equals(user.getPassword())){
            return ErrorCodeEnum.USER_ERROR_A0101;
//            A0200表示用户名或密码为空
        }
        try {
            userMapper.insert(user);
            folderService.addFolder(new Folder(user.getId(),"默认文件夹"));
            return ErrorCodeEnum.SUCCESS;
        }catch (Exception e) {
            throw new RuntimeException();
        }
    }
}




