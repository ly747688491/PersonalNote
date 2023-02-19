package com.personalnote;

import com.personalnote.controller.LoginController;
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
    private LoginController loginControl;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void login() {
        Map<String, Object> stringObjectMap = userMapper.selectMapById(1L);

    }

}
