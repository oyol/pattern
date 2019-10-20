package com.oyol.fiveplusone;

import com.oyol.fiveplusone.abstractMethod.AbstractFactory;
import com.oyol.fiveplusone.abstractMethod.DellAbstractFactory;
import com.oyol.fiveplusone.methodMethod.DellFactory;
import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Factory;
import com.oyol.fiveplusone.pojo.Television;
import com.oyol.fiveplusone.simpleMethod.ComputerSimpleFactory;
import org.junit.jupiter.api.Test;

/**
 *  5+1 创建型模式测试
 */
public class App {
    /**
     *  简单工厂模式
     */
    @Test
    public void SimpleTest(){
        ComputerSimpleFactory.getComputer("dell").show();
    }

    /**
     *  工厂方法模式
     */
    @Test
    public void MethodTest(){
        // 创建工厂对象
        Factory factory = new DellFactory();
        // 工厂创建对象
        factory.product().show();
    }

    /**
     *  抽象工厂模式
     */
    @Test
    public void AbstractTest(){
        AbstractFactory factory = new DellAbstractFactory();
        Computer computer = factory.productComputer();
        computer.show();
        Television television = factory.productTelevision();
        television.show();
    }
}
