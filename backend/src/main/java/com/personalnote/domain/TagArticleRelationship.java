package com.personalnote.domain;
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