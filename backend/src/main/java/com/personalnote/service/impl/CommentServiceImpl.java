package com.personalnote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personalnote.domain.Comment;
import com.personalnote.service.CommentService;
import com.personalnote.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author LY
* @description 针对表【comment(评论表)】的数据库操作Service实现
* @createDate 2023-02-25 18:13:20
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




