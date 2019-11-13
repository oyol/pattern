package com.oyol.seven.decorator;

public class Client {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();

        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();


    }
}
