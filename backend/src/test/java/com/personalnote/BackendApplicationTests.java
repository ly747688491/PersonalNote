package com.personalnote;

import com.personalnote.controller.SignupController;
import com.personalnote.domain.Folder;
import com.personalnote.domain.Note;
import com.personalnote.domain.User;
import com.personalnote.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    SignupController signupController;
    @Test
    public void testInsert(){
        User user = new User("test2", "987654321","男","13898163065");
        int result = userMapper.insert(user);
        System.out.println("受影响行数："+result);
        System.out.println("id自动获取："+user.getId());
    }

    @Test
    public void testUpdate() {
        User user = new User("test3", "987654321","男","13898163065");
        signupController.signup(user);
    }
    @Test
    public void testSelect() {
        User user = userMapper.selectById(2L);
        List<Folder> folders = userMapper.selectFoldersByUserId(user.getId());
        System.out.println(folders);
        for (Folder folder : folders) {
            List<Note> notes = folder.getNotes();
            System.out.println(notes);
        }
    }


}
