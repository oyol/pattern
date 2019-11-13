package com.oyol.seven.proxy.staticProxy;

import com.oyol.seven.proxy.dynamicProxy.Movie;

public class ProxyMovie implements Movie {
    // 持有真实对象的引用
    RealMovie realMovie;
    public ProxyMovie(RealMovie realMovie) {
        this.realMovie = realMovie;
    }
    public void play() {
        slogan(true);
        realMovie.play();
        slogan(false);
    }
    private void slogan(boolean isStart){
        if (isStart) {
            System.out.println("电影即将开始,请关闭手机");
        } else {
            System.out.println("电影即将结束,请有序离场");
        }
    }
}
