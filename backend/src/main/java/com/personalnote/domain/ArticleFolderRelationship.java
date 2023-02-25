package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 文件夹文章对应表
 */
@Data
public class ArticleFolderRelationship implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件夹id主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 文件夹id
     */
    private Long folderId;

}