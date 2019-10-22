package com.oyol.fiveplusone.builder;

/**
 *  具体建造者B
 */
public class BuilderB extends AbstractBuilder {
    public void buildFood() {
        meal.setFood("面包");
    }

    public void buildDrink() {
        meal.setDrink("牛奶");
    }
}
