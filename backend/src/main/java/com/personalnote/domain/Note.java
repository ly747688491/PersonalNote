package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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

    private Long folderId;

    private String noteTitle;

    private String noteText;

    private Date createTime;

    private Date updateTime;

    private Integer browseNum;

    private Integer collectNum;

    private Integer starNum;

    private Integer commentNum;
    @TableField(exist = false)
    private Folder folder;

    private static final long serialVersionUID = 1L;
}