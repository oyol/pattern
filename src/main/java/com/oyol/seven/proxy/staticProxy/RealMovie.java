package com.oyol.seven.proxy.staticProxy;

import com.oyol.seven.proxy.dynamicProxy.Movie;

public class RealMovie implements Movie {
    public void play() {
        System.out.println("观看电影《当幸福来敲门》");
    }
}
