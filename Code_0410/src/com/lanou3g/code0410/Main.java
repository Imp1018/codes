package com.lanou3g.code0410;

/**
 * Created by dllo on 18/4/10.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setKind("猫");
        animal.eat();
        animal.shout();

        Cat cat = new Cat();
        cat.setKind("猫");
        cat.shout();
        cat.eat();
        cat.sellMoe();

        Dog dog = new Dog();
        dog.lookDoor();
    }
}
