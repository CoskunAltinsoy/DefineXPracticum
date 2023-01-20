package com.example.patikaspringframework.interceptor;

@CustomInterceptor
public class Login {
    public String isLogin(String data){
        return "isLogin: "+data;
    }
}
