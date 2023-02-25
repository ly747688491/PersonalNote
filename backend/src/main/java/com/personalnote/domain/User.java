package com.personalnote.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName user
 */
@TableName(value ="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String idCard;

    private String realName;

    private String gender;

    private String address;

    private String phone;

    private String age;

    private Date createTime;

    private Integer isDeleted;

    private Long photo;

    private static final long serialVersionUID = 1L;

    public User(String username, String password, String gender, String phone) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }
}