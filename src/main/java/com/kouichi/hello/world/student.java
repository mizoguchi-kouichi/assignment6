package com.kouichi.hello.world;

public class student {

    public String name;
    public int age;

    public String birthplace;

    public student(String name, int age, String birthplace) {
        this.name = name;
        this.age = age;
        this.birthplace = birthplace;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return birthplace;
    }
}
