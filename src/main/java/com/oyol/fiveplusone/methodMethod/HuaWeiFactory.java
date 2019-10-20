package com.oyol.fiveplusone.methodMethod;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Factory;
import com.oyol.fiveplusone.pojo.impl.HuaWeiComputer;

/**
 *  华为工厂类
 */
public class HuaWeiFactory implements Factory {
    public Computer product() {
        return new HuaWeiComputer();
    }
}
