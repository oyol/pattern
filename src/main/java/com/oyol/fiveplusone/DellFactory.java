package com.oyol.fiveplusone;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Factory;
import com.oyol.fiveplusone.pojo.impl.DellComputer;

/**
 *  戴尔工厂类
 */
public class DellFactory implements Factory {
    public Computer product() {
        return new DellComputer();
    }
}
