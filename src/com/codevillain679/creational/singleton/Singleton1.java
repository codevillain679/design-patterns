package com.codevillain679.creational.singleton;

// Eager Initialization
public class Singleton1 {

    private static final Singleton1 SINGLE_INSTANCE = new Singleton1();

    private Singleton1() {
        System.out.println("Singleton 1 CREATED");
    }

    public static Singleton1 getInstance() {
        return SINGLE_INSTANCE;
    }
}

