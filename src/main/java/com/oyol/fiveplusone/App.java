package com.oyol.fiveplusone;

import org.junit.jupiter.api.Test;

/**
 *  5+1 创建型模式测试
 */
public class App {
    @Test
    public void SimpleTest(){
        ComputerSimpleFactory.getComputer("dell").show();
    }
}
