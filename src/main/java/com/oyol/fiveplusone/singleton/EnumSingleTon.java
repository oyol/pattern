package com.oyol.fiveplusone.singleton;

/**
 *  枚举式单例
 */
public enum EnumSingleTon {
    INSTANCE;
    public void test(){
        System.out.println("枚举式单例调用实例方法");
    }
}
