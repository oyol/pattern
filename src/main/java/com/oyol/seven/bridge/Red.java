package com.oyol.seven.bridge;

public class Red implements Color {
    public void paint(String penType, String name) {
        System.out.println(penType + "画红色的" + name);
    }
}
