package com.lanou3g.code0410;

/**
 * Created by dllo on 18/4/10.
 */
//   多态
public class Test02 {
    public static void main(String[] args) {
        //  父类引用指向子类对象
        //  ------- 多态
        Animal animal = new Cat();

        Animal animal1 = new Dog();
        Dog dog= (Dog) animal1;   //向下转型
        dog.lookDoor();

        Animal animal2 = new Animal();
        Animal animal3 = new EnglishShortCat();

        Zoo zoo=new Zoo();
        zoo.feed(animal);
        zoo.feed(animal1);
        zoo.feed(animal2);
        zoo.feed(animal3);
    }
}
