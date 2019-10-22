package com.oyol.fiveplusone.singleton;

/**
 * 懒汉式单例
 */
public class SynchronizedLazySingleTon {
    private static SynchronizedLazySingleTon synchronizedLazySingleTon;

    private SynchronizedLazySingleTon() {}

    public static synchronized SynchronizedLazySingleTon getInstance() {
        if (synchronizedLazySingleTon == null) {
            synchronizedLazySingleTon = new SynchronizedLazySingleTon();
        }
        return synchronizedLazySingleTon;
    }
}
