package com.oyol.fiveplusone.singleton;

/**
 * 双检索单例
 */
public class DoubleCheckSingleTon {
    private static volatile DoubleCheckSingleTon doubleCheckSingleTon;

    private DoubleCheckSingleTon() {}

    public static DoubleCheckSingleTon getInstance() {
        if (doubleCheckSingleTon == null) {
            synchronized (DoubleCheckSingleTon.class) {
                if (doubleCheckSingleTon == null) {
                    doubleCheckSingleTon = new DoubleCheckSingleTon();
                }
            }
        }
        return doubleCheckSingleTon;
    }
}
