package com.oyol.fiveplusone;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Television;

/**
 * 抽象工厂类
 */
public interface AbstractFactory {
    Computer productComputer();

    Television productTelevision();
}
