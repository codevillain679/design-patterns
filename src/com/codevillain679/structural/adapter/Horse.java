package com.codevillain679.structural.adapter;

public class Horse implements Animal{
    private String name;

    public Horse(String name){
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Horse "+name+" jumps and runs around the stable");
    }

    @Override
    public void eat() {
        System.out.println("Horse "+name+" eats only special horse food");
    }

    @Override
    public void sleep() {
        System.out.println("Horse "+name+" sleeps standing");
    }

    @Override
    public void play() {
        System.out.println("Horse "+name+" plays all day");
    }
}
