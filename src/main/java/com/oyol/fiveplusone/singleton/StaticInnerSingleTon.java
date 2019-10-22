package com.oyol.fiveplusone.singleton;

/**
 * 静态内部类单例
 */
public class StaticInnerSingleTon {
    private StaticInnerSingleTon() {}

    private static class Inner {
        private static final StaticInnerSingleTon staticInnerSingleTon = new StaticInnerSingleTon();
    }

    public static StaticInnerSingleTon getInstance() {
        return Inner.staticInnerSingleTon;
    }
}
