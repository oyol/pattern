package com.oyol.seven.facade;

/**
 *  计算机系统
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;
    public Computer(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        System.out.println("电脑开始启动");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("电脑启动完成");
    }

    public void shutDown(){
        System.out.println("电脑开始关机");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("电脑关机完成");
    }
}
