package com.personalnote.domain;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * 评论回复表
 */
@Data
public class CommentReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 被回复id
     */
    private Long replyId;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 审核状态‘0’待审核‘1‘审核通过’2‘审核不通过
     */
    private String state;

    /**
     * 点赞数
     */
    private String starNum;

    /**
     * 回复时间
     */
    private Date createTime;

}