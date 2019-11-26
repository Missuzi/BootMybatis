package com.lol.common;

public enum ResultCode {
    SUCCESS(200, "成功"),
    FAILED(500, "失败");

    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }


    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
