package com.oyol.fiveplusone;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Television;
import com.oyol.fiveplusone.pojo.impl.XiaoMiComputer;
import com.oyol.fiveplusone.pojo.impl.XiaoMiTelevision;

public class XiaoMiAbstractFactory implements AbstractFactory {
    public Computer productComputer() {
        return new XiaoMiComputer();
    }

    public Television productTelevision() {
        return new XiaoMiTelevision();
    }
}
