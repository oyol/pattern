package com.oyol.seven.bridge;

public class Blue implements Color {
    public void paint(String penType, String name) {
        System.out.println(penType + "画蓝色的" + name);
    }
}
