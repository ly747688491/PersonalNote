package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Note;
import com.personalnote.service.NoteService;
import com.personalnote.mapper.NoteMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【note(笔记表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note>
    implements NoteService{

}




