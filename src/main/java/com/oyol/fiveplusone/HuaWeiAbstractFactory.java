package com.oyol.fiveplusone;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Television;
import com.oyol.fiveplusone.pojo.impl.HuaWeiComputer;
import com.oyol.fiveplusone.pojo.impl.HuaWeiTelevision;

public class HuaWeiAbstractFactory implements AbstractFactory {
    public Computer productComputer() {
        return new HuaWeiComputer();
    }

    public Television productTelevision() {
        return new HuaWeiTelevision();
    }
}
