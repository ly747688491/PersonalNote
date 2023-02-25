package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName notes_folder
 */
@TableName(value ="notes_folder")
@Data
public class NotesFolder implements Serializable {
    private Long id;

    private Long noteId;

    private Long folderId;

    private static final long serialVersionUID = 1L;
}