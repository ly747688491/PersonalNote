package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName comment
 */
@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    private Long id;

    private Long noteId;

    private Long userId;

    private String content;

    private Integer state;

    private Integer starNum;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}