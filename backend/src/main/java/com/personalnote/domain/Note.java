package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName note
 */
@TableName(value ="note")
@Data
public class Note implements Serializable {
    private Long noteId;

    private Long userId;

    private String noteTitle;

    private String note;

    private Date createTime;

    private Date updateTime;

    private Integer browseNum;

    private Integer collectNum;

    private Integer starNum;

    private Integer commentNum;

    private static final long serialVersionUID = 1L;
}