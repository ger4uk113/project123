package com.example.catproject;

public class Cat {
    private String name;
    private int age, color;

    public Cat(){
    }

    public Cat(String name, int age, int color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getColor() {
        return color;
    }
}
