package com.personalnote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.personalnote.domain.Folder;
import com.personalnote.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author LY
* @description 针对表【user(用户表信息)】的数据库操作Mapper
* @createDate 2023-02-18 16:42:14
* @Entity com.personalnote.domain.User
*/
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT folder_id,user_id,folder_name FROM folder WHERE user_id = #{userID}")
    @Results({
            @Result(property = "folderId",column = "folder_id"),
            @Result(property = "userId",column = "user_id"),
            @Result(property = "folderName",column = "folder_name"),
            @Result(property = "user",column = "user_id",one = @One(select = "com.personalnote.mapper.UserMapper.selectById")),
            @Result(property = "notes",column = "folder_id",many = @Many(select = "com.personalnote.mapper.UserMapper.selectByFolderId"))
    })
    List<Folder> selectFoldersByUserId(Long userId);


}



