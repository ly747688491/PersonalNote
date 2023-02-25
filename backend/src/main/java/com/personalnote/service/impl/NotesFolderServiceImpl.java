package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.NotesFolder;
import com.personalnote.service.NotesFolderService;
import com.personalnote.mapper.NotesFolderMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【notes_folder(文件夹文章对应表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class NotesFolderServiceImpl extends ServiceImpl<NotesFolderMapper, NotesFolder>
    implements NotesFolderService{

}




