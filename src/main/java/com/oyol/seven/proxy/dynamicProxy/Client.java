package com.oyol.seven.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();
        ProxyMovie proxyMovie = new ProxyMovie(realMovie);
        Movie proxyInstance = (Movie) Proxy.newProxyInstance(RealMovie.class.getClassLoader(), RealMovie.class.getInterfaces(), proxyMovie);
        proxyInstance.play();

    }
}
