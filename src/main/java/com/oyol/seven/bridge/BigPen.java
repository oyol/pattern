package com.oyol.seven.bridge;

public class BigPen extends AbstracePen {
    public void draw(String name) {
        String penType = "大号笔";
        this.color.paint(penType,name);
    }
}
