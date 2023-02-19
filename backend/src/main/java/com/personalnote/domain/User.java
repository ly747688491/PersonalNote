package com.personalnote.domain;

/**
 * @author LY
 * @date 2023/2/18 16:54
 * @description User
 */
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * 用户表信息
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 年龄
     */
    private String age;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    private String isDeleted;

}