package com.personalnote;

import com.personalnote.controller.LoginController;
import com.personalnote.controller.RegisterController;
import com.personalnote.mapper.UserMapper;
import com.personalnote.result.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class BackendApplicationTests {


    @Autowired
    private LoginController loginControl;
    @Autowired
    private RegisterController registerController;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void login() {
        Map<String, Object> stringObjectMap = userMapper.selectMapById(1L);

    }
    @Test
    public void register() {
        User user = new User();
        user.setUsername("qwertyuiop");
        user.setPassword("1234567899876");
        user.setPhone("13898163065");
        Result<String> register = registerController.register(user);
        System.out.println(register);
    }

}
