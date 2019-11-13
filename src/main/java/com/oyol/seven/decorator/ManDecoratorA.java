package com.oyol.seven.decorator;

public class ManDecoratorA extends Decorator {
    public void eat(){
        super.eat();
        drink();
        System.out.println("ManDecoratroA类");
    }

    public void drink(){
        System.out.println("男人喝蛋花汤");
    }
}
