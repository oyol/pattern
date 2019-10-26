package com.oyol.seven.adapter.obj;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Target target = new Cat(dog);
        target.say();
    }
}
