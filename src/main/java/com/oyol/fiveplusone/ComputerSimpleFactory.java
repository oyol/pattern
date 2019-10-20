package com.oyol.fiveplusone;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.impl.DellComputerImpl;
import com.oyol.fiveplusone.pojo.impl.HuaWeiComputer;
import com.oyol.fiveplusone.pojo.impl.XiaoMiComputer;

/**
 *  简单工厂模式
 *  获取电脑对象
 */
public class ComputerSimpleFactory {
    public static Computer getComputer(String name) {
        if (name.equalsIgnoreCase("dell")) {
            return new DellComputerImpl();
        } else if (name.equalsIgnoreCase("huawei")){
            return new HuaWeiComputer();
        } else if (name.equalsIgnoreCase("xiaomi")) {
            return new XiaoMiComputer();
        } else {
            return null;
        }
    }
}
