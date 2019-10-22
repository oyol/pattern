package com.oyol.fiveplusone.builder;

/**
 * 调用创建的指挥者
 */
public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Meal provideMeal() {
        builder.buildFood();
        builder.buildDrink();
        return builder.getMeal();
    }
}
