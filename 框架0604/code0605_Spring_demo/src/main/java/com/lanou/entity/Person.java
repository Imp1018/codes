package com.lanou.entity;

public class Person {
    private String name;
    private int age;
    private String gender;

    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dog=" + dog +
                '}';
    }

    public Dog getDog() {
        return dog;
    }

    public Person setDog(Dog dog) {
        this.dog = dog;
        return this;
    }



    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }
}
