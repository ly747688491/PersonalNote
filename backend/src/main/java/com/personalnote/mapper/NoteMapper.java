package com.personalnote.mapper;

import com.personalnote.domain.Note;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author LY
* @description 针对表【note(笔记表)】的数据库操作Mapper
* @createDate 2023-02-25 18:13:20
* @Entity com.personalnote.domain.Note
*/
@Repository
public interface NoteMapper extends BaseMapper<Note> {

    @Select("SELECT " +
            "note_id,user_id,folder_id,note_title,note_text,create_time,update_time" +
            " FROM note WHERE folder_id = #{folderId}")
    @Results({
            @Result(property = "noteId",column = "note_id"),
            @Result(property = "userId",column = "user_id"),
            @Result(property = "folderId",column = "folder_id"),
            @Result(property = "noteTitle",column = "note_title"),
            @Result(property = "noteText",column = "note_text"),
            @Result(property = "createTime",column = "create_time"),
            @Result(property = "updateTime",column = "update_time"),
            @Result(property = "folder",column = "folder_id",one = @One(select = "com.personalnote.mapper.FolderMapper.selectById"))
    })
    List<Note> selectByFolderId(Long folderId);
}




