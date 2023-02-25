package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName comment_reply
 */
@TableName(value ="comment_reply")
@Data
public class CommentReply implements Serializable {
    private Long id;

    private Long userId;

    private Long replyId;

    private String content;

    private Integer state;

    private Integer starNum;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}