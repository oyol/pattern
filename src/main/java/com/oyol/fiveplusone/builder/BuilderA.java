package com.oyol.fiveplusone.builder;

/**
 *  具体建造者A
 */
public class BuilderA extends AbstractBuilder {
    public void buildFood() {
        meal.setFood("油条");
    }

    public void buildDrink() {
        meal.setDrink("豆浆");
    }
}
