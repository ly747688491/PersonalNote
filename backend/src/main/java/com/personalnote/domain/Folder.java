package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName folder
 */
@TableName(value ="folder")
@Data
public class Folder implements Serializable {
    private Long folderId;

    private Long userId;

    private String folderName;

    private static final long serialVersionUID = 1L;
}