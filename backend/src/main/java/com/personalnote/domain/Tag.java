package com.personalnote.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 标签表
 */
@Data
public class Tag implements  Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Long id;

    /**
     * 标签名
     */
    private String username;

}