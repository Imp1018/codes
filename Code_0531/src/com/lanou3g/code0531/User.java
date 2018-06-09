package com.lanou3g.code0531;

public class User {
    private String username;
    private String[] hobbies;
    private int age;

    public String[] getHobbies() {
        return hobbies;
    }

    public User setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getUsername() {

        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }
}
