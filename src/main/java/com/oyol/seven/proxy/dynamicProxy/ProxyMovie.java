package com.oyol.seven.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyMovie implements InvocationHandler {
    Movie movie;
    public ProxyMovie(Movie movie){
        this.movie = movie;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("电影即将开始,请坐好");
        method.invoke(movie,args);
        System.out.println("电影即将结束,请起立");
        return null;
    }
}
