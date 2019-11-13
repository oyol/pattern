package com.oyol.seven.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 *  享元工厂
 */
public class FlyWeightFactory {
    // 对象存放容器
    private static ConcurrentHashMap<String,FlyWeight> map = new ConcurrentHashMap<String, FlyWeight>();

    public static FlyWeight getFlyWeight(String name){
        if (map.get(name) == null) {
            synchronized (map) {
                if (map.get(name) == null) {
                    ChildFlyWeight childFlyWeight = new ChildFlyWeight();
                    map.put(name,childFlyWeight);
                }
            }
        }
        return map.get(name);
    }
}
