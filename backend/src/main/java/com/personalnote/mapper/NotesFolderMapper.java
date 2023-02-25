package com.personalnote.mapper;

import com.personalnote.domain.NotesFolder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author LY
* @description 针对表【notes_folder(文件夹文章对应表)】的数据库操作Mapper
* @createDate 2023-02-25 18:13:20
* @Entity com.personalnote.domain.NotesFolder
*/
@Repository
public interface NotesFolderMapper extends BaseMapper<NotesFolder> {

}




