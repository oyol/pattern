package com.oyol.fiveplusone.abstractMethod;

import com.oyol.fiveplusone.pojo.Computer;
import com.oyol.fiveplusone.pojo.Television;
import com.oyol.fiveplusone.pojo.impl.DellComputer;
import com.oyol.fiveplusone.pojo.impl.DellTelevision;

public class DellAbstractFactory implements AbstractFactory {
    public Computer productComputer() {
        return new DellComputer();
    }

    public Television productTelevision() {
        return new DellTelevision();
    }
}
