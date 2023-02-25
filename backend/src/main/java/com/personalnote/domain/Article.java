package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * 文章表
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id主键
     */
    @TableId(type = IdType.AUTO)
    private Long articleId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 文章被浏览数
     */
    private Integer browseNum;

    /**
     * 文章被收藏数
     */
    private Integer collectNum;

    /**
     * 文章点赞数
     */
    private Integer starNum ;

    /**
     * 文件路径
     */
    private String articlePath;

    /**
     * 文件名
     */
    private String articleName;

}