package com.oyol.fiveplusone.builder;

/**
 *  抽象建造者
 */
public abstract class AbstractBuilder {
    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
