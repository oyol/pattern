package com.oyol.fiveplusone.singleton;

/**
 * 饿汉式单例
 */
public class HungrySingleTon {
    private static HungrySingleTon hungrySingleTon = new HungrySingleTon();

    private HungrySingleTon() {}

    public static HungrySingleTon getInstance() {
        return hungrySingleTon;
    }
}
