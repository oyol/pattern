package com.oyol.fiveplusone.singleton;

/**
 * 懒汉式单例
 * 线程不安全
 */
public class LazySingleTon {
    private static LazySingleTon lazySingleTon;

    private LazySingleTon() {}

    public static LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }
}
