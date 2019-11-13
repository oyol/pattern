package com.oyol.seven.proxy.dynamicProxy;

public class RealMovie implements Movie {
    public void play() {
        System.out.println("观看电影《当幸福来敲门》");
    }
}
