package com.personalnote.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 标签文章对应表
 */
@Data
public class TagArticleRelationship implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 标签id
     */
    private String tagId;

    /**
     * 文章id
     */
    private Long articleId;

}