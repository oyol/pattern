package com.oyol.fiveplusone.prototype;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();
        ProductA productA = new ProductA('*');
        manager.register("one",productA);
        manager.create("one").use("hello world");

        ProductA productA1 = new ProductA('!');
        manager.register("two",productA1);
        manager.create("two").use("hello world");

        System.out.println(manager.create("one") == manager.create("two"));

        Student student = new Student();
        Student clone = student.clone();
        System.out.println(clone == student);
    }
}
