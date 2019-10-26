package com.oyol.seven.adapter.obj;

/**
 *  想要的对象
 */
public class Cat implements Target {
    private Dog dog;
    public Cat(Dog dog){this.dog = dog;}
    public void say() {
        dog.say();
    }
}
