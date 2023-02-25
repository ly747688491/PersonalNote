package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.CommentReply;
import com.personalnote.service.CommentReplyService;
import com.personalnote.mapper.CommentReplyMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【comment_reply(评论回复表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply>
    implements CommentReplyService{

}




