package com.oyol.seven.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();
        ProxyMovie proxyMovie = new ProxyMovie(realMovie);
        proxyMovie.play();
    }
}
