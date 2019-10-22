package com.oyol.fiveplusone.builder;

/**
 *  餐饮对象
 */
public class Meal {
    private String food;
    private String drink;

    public void setFood(String food){
        this.food = food;
    }
    public String getFood(){
        return food;
    }
    public void setDrink(String drink){
        this.drink = drink;
    }
    public String getDrink(){
        return drink;
    }

    public String toString(){
        return "food: " + this.food + ", drink: " + this.drink;
    }
}
