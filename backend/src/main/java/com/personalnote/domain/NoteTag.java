package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName note_tag
 */
@TableName(value ="note_tag")
@Data
public class NoteTag implements Serializable {
    private Long id;

    private Long tagId;

    private Long noteId;

    private static final long serialVersionUID = 1L;
}