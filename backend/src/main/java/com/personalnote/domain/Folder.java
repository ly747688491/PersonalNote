package com.personalnote.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件夹表信息
 */
@Data
public class Folder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件夹id主键
     */
    private Long folderId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 文件夹名称
     */
    private String folderName;

}