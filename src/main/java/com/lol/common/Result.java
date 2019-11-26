package com.lol.common;

public class Result<T> {
    private long code;
    private String message;
    private T data;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    protected Result() {

    }

    protected Result(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回的结果
     *
     * @param data 获取的数据
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {

        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);

    }


    public static <T> Result<T> success(T data, String message) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), message, data);


    }

    public  static <T> Result<T> fail(){
        return  new Result<T>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage(),null);

    }

    public  static <T> Result<T> fail(String Message){
        return  new Result<T>(ResultCode.FAILED.getCode(),Message,null);

    }


}
