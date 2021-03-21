package com.codevillain679.structural.adapter;

public class Duck {
    private String name;

    public Duck(String name){
        this.name = name;
    }

    public void swim() {
        System.out.println("Duck "+name+" swims 5 spaces");
    }

    public void slobber() {
        System.out.println("Duck "+name+" eats only special duck food that floats in water");
    }

    public void dobber() {
        System.out.println("Duck "+name+" sleeps floating");
    }

    public void splash() {
        System.out.println("Duck "+name+" splashes water all day");
    }
}
