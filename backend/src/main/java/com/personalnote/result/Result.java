package com.personalnote.result;

public class Result<T> {
    private boolean code;
    private T data;
    private String errorMessage;

    private Result(boolean code, T data, String errorMessage) {
        this.code = code;
        this.data = data;
        this.errorMessage = errorMessage;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(true, data, null);
    }

    public static <T> Result<T> error(String errorMessage) {
        return new Result<>(false, null, errorMessage);
    }

    public boolean isSuccess() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

