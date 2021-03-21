package com.codevillain679.structural.adapter;

public class DuckAdapter implements Animal{
    private Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void move() {
        duck.swim();
    }

    @Override
    public void eat() {
        duck.slobber();
    }

    @Override
    public void sleep() {
        duck.dobber();
    }

    @Override
    public void play() {
        duck.splash();
    }
}
