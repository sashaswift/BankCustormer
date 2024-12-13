package com.example.banksystem.vo;

public class Result <T>{
    public int code;
    public String msg;
    public T data;
    public static <T> Result success(){
        Result r=new Result("suc",0,null);
        return r;
    }
    public static <T> Result success(T data){
        Result r=new Result("suc",0,data);
        return r;
    }
    public static <T> Result fail(T data){
        Result r=new Result("error",1,data);
        return r;
    }

    public Result(String msg,int code, T data){
        this.msg=msg;
        this.data=data;
        this.code=code;
    }


}
