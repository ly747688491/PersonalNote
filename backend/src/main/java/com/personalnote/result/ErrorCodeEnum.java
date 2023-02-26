package com.personalnote.result;

/**
 * @author LY
 * @date 2023/2/26 12:52
 * @description ErrorCodeEnum
 */
public enum ErrorCodeEnum {
    SUCCESS("00000", "成功"),
    USER_ERROR_0001("A0001", "用户端错误"),
    USER_ERROR_A0100("A0100", "用户名已存在"),
    USER_ERROR_A0101("A0101", "用户名或密码为空"),
    USER_ERROR_A0102("A0102", "用户名不存在"),
    USER_ERROR_A0200("A0200", "文件夹已存在"),
    USER_ERROR_A9999("A9999", "发生未知错误");


    private final String code;
    private final String description;

    ErrorCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
