package com.oyol.fiveplusone.methodMethod;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Factory;
import com.oyol.fiveplusone.pojo.impl.XiaoMiComputer;

/**
 *  小米工厂类
 */
public class XiaoMiFactory implements Factory {
    public Computer product() {
        return new XiaoMiComputer();
    }
}
