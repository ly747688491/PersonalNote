package com.personalnote.mapper;

import com.personalnote.domain.CommentReply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author LY
* @description 针对表【comment_reply(评论回复表)】的数据库操作Mapper
* @createDate 2023-02-25 18:13:20
* @Entity com.personalnote.domain.CommentReply
*/
@Repository
public interface CommentReplyMapper extends BaseMapper<CommentReply> {

}




