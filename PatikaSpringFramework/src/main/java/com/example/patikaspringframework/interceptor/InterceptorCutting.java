package com.example.patikaspringframework.interceptor;

import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@CustomInterceptor
public class InterceptorCutting {
    @AroundInvoke public Object logging(InvocationContext context){
        System.out.println("First: "+context.getMethod().getName());

        boolean isLogin = false;
        Object isContinue = null;

        if (isLogin){
            System.out.println("First you should login");
            return null;
        }
        else {
            try {
                isContinue = context.proceed();
                System.out.println(isContinue);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
