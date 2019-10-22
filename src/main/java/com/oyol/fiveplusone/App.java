package com.oyol.fiveplusone;

import com.oyol.fiveplusone.abstractMethod.AbstractFactory;
import com.oyol.fiveplusone.abstractMethod.DellAbstractFactory;
import com.oyol.fiveplusone.builder.BuilderA;
import com.oyol.fiveplusone.builder.BuilderB;
import com.oyol.fiveplusone.builder.Director;
import com.oyol.fiveplusone.methodMethod.DellFactory;
import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Factory;
import com.oyol.fiveplusone.pojo.Television;
import com.oyol.fiveplusone.simpleMethod.ComputerSimpleFactory;
import com.oyol.fiveplusone.singleton.EnumSingleTon;
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

    @Test
    public void EnumSingleton(){
        EnumSingleTon instance = EnumSingleTon.INSTANCE;
        instance.test();
    }

    @Test
    public void builderTest(){
        Director director = new Director(new BuilderB());
        System.out.println(director.provideMeal());
    }
}
