package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.NoteTag;
import com.personalnote.service.NoteTagService;
import com.personalnote.mapper.NoteTagMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【note_tag(标签文章对应表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class NoteTagServiceImpl extends ServiceImpl<NoteTagMapper, NoteTag>
    implements NoteTagService{

}




