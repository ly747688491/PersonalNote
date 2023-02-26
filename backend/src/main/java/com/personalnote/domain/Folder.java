package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @TableName folder
 */
@TableName(value ="folder")
@Data
public class Folder implements Serializable {
    @TableId(value = "folder_id")
    private Long folderId;
    private Long userId;

    private String folderName;

    @TableField(exist = false)
    private User user;
    @TableField(exist = false)
    private List<Note> notes;

    private static final long serialVersionUID = 1L;
    public Folder(long userId,String folderName) {
        this.userId = userId;
        this.folderName = folderName;
    }
}