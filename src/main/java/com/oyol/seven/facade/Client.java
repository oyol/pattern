package com.oyol.seven.facade;

/**
 *  客户端调用
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("===电脑使用完毕===");
        computer.shutDown();
    }
}
