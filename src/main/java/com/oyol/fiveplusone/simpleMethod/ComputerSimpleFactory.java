package com.oyol.fiveplusone.simpleMethod;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.impl.DellComputer;
import com.oyol.fiveplusone.pojo.impl.HuaWeiComputer;
import com.oyol.fiveplusone.pojo.impl.XiaoMiComputer;

/**
 *  简单工厂模式
 *  获取电脑对象
 */
public class ComputerSimpleFactory {
    public static Computer getComputer(String name) {
        if (name.equalsIgnoreCase("dell")) {
            return new DellComputer();
        } else if (name.equalsIgnoreCase("huawei")){
            return new HuaWeiComputer();
        } else if (name.equalsIgnoreCase("xiaomi")) {
            return new XiaoMiComputer();
        } else {
            return null;
        }
    }
}
