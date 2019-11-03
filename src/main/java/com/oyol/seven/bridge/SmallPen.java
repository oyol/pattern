package com.oyol.seven.bridge;

public class SmallPen extends AbstracePen {
    public void draw(String name) {
        String penType = "小号笔";
        this.color.paint(penType,name);
    }
}
