package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName photo
 */
@TableName(value ="photo")
@Data
public class Photo implements Serializable {
    private Long id;

    private String photo;

    private static final long serialVersionUID = 1L;
}