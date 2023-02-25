package com.personalnote;

import com.personalnote.controller.LoginController;
import com.personalnote.controller.RegisterController;
import com.personalnote.domain.User;
import com.personalnote.mapper.UserMapper;
import com.personalnote.result.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void testInsert(){
        User user = new User("test2", "987654321","男","13898163065");
        int result = userMapper.insert(user);
        System.out.println("受影响行数："+result);
        System.out.println("id自动获取："+user.getId());
    }


}
