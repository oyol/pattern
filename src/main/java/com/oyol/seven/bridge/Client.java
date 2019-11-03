package com.oyol.seven.bridge;

public class Client {
    public static void main(String[] args) {
        Red red = new Red();
        BigPen bigPen = new BigPen();

        bigPen.setColor(red);
        bigPen.draw("鲜花");
    }
}
